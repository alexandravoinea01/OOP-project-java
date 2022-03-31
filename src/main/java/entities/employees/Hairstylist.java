package entities.employees;

public class Hairstylist extends Employee {
    private boolean braids;
    private boolean coloring;
    private boolean styling;

    public Hairstylist() {
        super();
        this.braids = false;
        this.coloring = false;
        this.styling = false;
    }

    public Hairstylist(String name, float rating, double salary, String[] services, String specialization, boolean braids, boolean coloring, boolean styling) {
        super(name, rating, salary, specialization);
        this.braids = braids;
        this.coloring = coloring;
        this.styling = styling;
    }

    public boolean getBraids() {
        return this.braids;
    }

    public void setBraids(boolean braids) {
        this.braids = braids;
    }

    public boolean getColoring() {
        return this.coloring;
    }

    public void setColoring(boolean coloring) {
        this.coloring = coloring;
    }

    public boolean getStyling() {
        return this.styling;
    }

    public void setStyling(boolean styling) {
        this.styling = styling;
    }
}
