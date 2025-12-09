package AbstractionProblems.ReportGenerationFramework;

import java.util.Map;

public class Record {
  Map<String, Object> fields;

  public <K, V> Record(Map<String,Object> fields) {
    this.fields = fields;
  }

  public Object getFieldId(String key) {
    return this.fields.getOrDefault(key, null);
  }
}
