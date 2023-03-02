package Enums;

public enum Priority {

    LOW(1),
    MEDIUM(2),
    HIGH(3);
    private int level;
    Priority(int level){
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
