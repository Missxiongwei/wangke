import java.math.BigDecimal;

public class Entity {

    private Integer totalTime;
    private String  title;
    private Integer   type;
    private Integer   finishLength;
    private BigDecimal score;
    private Integer   chapterId;
    private BigDecimal  progress;
    private String   location;
    private Integer   id;
    private String   href;
    private String    suspendData;
    private Integer   companyRelationCourseId;
    private String  status;

    public Integer getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getFinishLength() {
        return finishLength;
    }

    public void setFinishLength(Integer finishLength) {
        this.finishLength = finishLength;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public BigDecimal getProgress() {
        return progress;
    }

    public void setProgress(BigDecimal progress) {
        this.progress = progress;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getSuspendData() {
        return suspendData;
    }

    public void setSuspendData(String suspendData) {
        this.suspendData = suspendData;
    }

    public Integer getCompanyRelationCourseId() {
        return companyRelationCourseId;
    }

    public void setCompanyRelationCourseId(Integer companyRelationCourseId) {
        this.companyRelationCourseId = companyRelationCourseId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
