package AbstractionProblems.ReportGenerationFramework;

import java.time.LocalDateTime;

public class Report {
  private final ReportType type;
  private final byte[] content;
  private final LocalDateTime generatedAt;

  public Report(ReportType type, byte[] content, LocalDateTime generatedAt) {
    this.type = type;
    this.content = content;
    this.generatedAt = generatedAt;
  }

  public ReportType getType() {
    return type;
  }

  public byte[] getContent() {
    return content;
  }

  public LocalDateTime getGeneratedAt() {
    return generatedAt;
  }
}
