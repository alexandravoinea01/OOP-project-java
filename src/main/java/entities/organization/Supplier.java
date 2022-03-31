package entities.organization;

import java.util.Date;

public class Supplier {
    private String name;
    private Date startDate;
    private Date finishDate;
    private String[] materials;

    public Supplier() {
        this.name = "";
        this.startDate = new Date();
        this.finishDate = new Date();
        this.materials = new String[5];
    }

    public Supplier(String name, Date startDate, Date finishDate, String[] materials) {
        this.name = name;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.materials = materials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public String[] getMaterials() {
        return materials;
    }

    public void setMaterials(String[] materials) {
        this.materials = materials;
    }
}
