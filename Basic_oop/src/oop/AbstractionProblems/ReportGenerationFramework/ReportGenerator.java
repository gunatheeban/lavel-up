package oop.AbstractionProblems.ReportGenerationFramework;

import java.time.LocalDateTime;
import java.util.List;

public abstract class ReportGenerator {

  public final Report generate(DataSource dataSource) {

    validate(dataSource);
    List<Record> records = fetchData(dataSource);
    String formatted = format(records);
    byte[] bytes = export(formatted);

    return new Report(getType(), bytes, LocalDateTime.now());
  }

  protected abstract void validate(DataSource ds);

  protected abstract List<Record> fetchData(DataSource ds);

  protected abstract String format(List<Record> records);

  protected abstract byte[] export(String formatted);

  public abstract ReportType getType();
}
