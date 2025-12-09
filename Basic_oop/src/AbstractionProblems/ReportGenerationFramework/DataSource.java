package AbstractionProblems.ReportGenerationFramework;

import java.util.Map;

public class DataSource {
  private final String table;
  private final Map<String, Object> filters;

  public DataSource(String table, Map<String, Object> filters) {
    this.table = table;
    this.filters = filters;
  }

  public String getTable() {
    return table;
  }

  public Map<String, Object> getFilters() {
    return filters;
  }
}
