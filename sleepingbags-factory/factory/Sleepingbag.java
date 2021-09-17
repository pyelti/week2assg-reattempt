package factory;

abstract public class Sleepingbag {
    String season;
    String tempRatings;
    String purpose;
    String size;

    public Sleepingbag() {
    }

    public String getSeason() {
        return this.season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getTempRatings() {
        return this.tempRatings;
    }

    public void setTempRatings(String tempRatings) {
        this.tempRatings = tempRatings;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Sleepingbag season(String season) {
        setSeason(season);
        return this;
    }

    public Sleepingbag tempRatings(String tempRatings) {
        setTempRatings(tempRatings);
        return this;
    }

    public Sleepingbag purpose(String purpose) {
        setPurpose(purpose);
        return this;
    }

    public Sleepingbag size(String size) {
        setSize(size);
        return this;
    }

    @Override
    public String toString() {
        return "{" + " season='" + getSeason() + "'" + ", tempRatings='" + getTempRatings() + "'" + ", purpose='"
                + getPurpose() + "'" + ", size='" + getSize() + "'" + "}";
    }

}