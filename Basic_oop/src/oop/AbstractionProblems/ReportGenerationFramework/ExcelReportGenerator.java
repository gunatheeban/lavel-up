package oop.AbstractionProblems.ReportGenerationFramework;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class ExcelReportGenerator extends ReportGenerator {

  private static final List<Record> records = List.of(
      new Record(Map.of("id", 1, "name", "Alice", "age", 25, "country", "US")),
      new Record(Map.of("id", 2, "name", "Bob", "age", 30, "country", "US"))
  );

  @Override
  protected void validate(DataSource ds) {
    if (!ds.getTable().equals("users")) {
      throw new RuntimeException("For now only Users table is connected");
    }
  }

  @Override
  protected List<Record> fetchData(DataSource ds) {

    Map<String, Object> filters = ds.getFilters();

    if (!filters.isEmpty()) {
      String country = (String) filters.getOrDefault("country", null);
      String status = (String) filters.getOrDefault("status", null);
      Integer minAge = (Integer) filters.getOrDefault("minAge", null);
      Integer maxAge = (Integer) filters.getOrDefault("maxAge", null);

      return records.stream().filter(record -> {
        String country1 = null, status1 = null;
        Integer minAge1 = null, maxAge1 = null;
        if (country != null) {
          country1 = (String) record.getFieldId("country");
        }
        if (status != null) {
          status1 = (String) record.getFieldId("status");
        }
        if (minAge != null) {
          minAge1 = (Integer) record.getFieldId("minAge");
        }
        if (maxAge != null) {
          maxAge1 = (Integer) record.getFieldId("maxAge");
        }
        return country1 != null && country1.equals(country) || status1 != null && status1.equals(
            status) || minAge1 != null && minAge1.equals(minAge)
            || maxAge1 != null && maxAge1.equals(
            maxAge);
      }).toList();
    }
    return records;
  }

  @Override
  protected String format(List<Record> records) {
    StringBuilder formatedString = new StringBuilder();
    formatedString.append("--- EXCEL REPORT ---").append("\n");
    formatedString.append("Rows : ").append(records.size()).append("\n");
    formatedString.append("Data : ").append("\n");
    for (Record record : records) {
      formatedString.append("ID: ").append(record.getFieldId("id")).append("\n");
      formatedString.append("Name: ").append(record.getFieldId("name")).append("\n");
      formatedString.append("Age: ").append(record.getFieldId("age")).append("\n");
      formatedString.append("Country: ").append(record.getFieldId("country")).append("\n");
    }
    return formatedString.toString();
  }

  @Override
  protected byte[] export(String formatted) {
    return formatted.getBytes(StandardCharsets.UTF_8);
  }

  @Override
  public ReportType getType() {
    return ReportType.EXCEL;
  }
}
