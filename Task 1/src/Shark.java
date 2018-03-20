/*
CSD2221 Individual Programming Assignment 2017 - Task 1
By Antanas Icikovic
ID: M00537517
Last edited: 2 December 2017 22:14
*/

class Shark {
    // Shark atributes
    private String realName;
    private String latinName;
    private Integer maxLength;
    private Integer maxDepth;
    private String maxYoung;
    private Integer globalIndex;
    private String sharkRegions;
    
    // Default shark object creation method
    public Shark(String newName, String newLatin, Integer newLength, 
          Integer newDepth, String newYoung, Integer newIndex, 
          String newRegions){
        realName = newName;
        latinName = newLatin;
        maxLength = newLength;
        maxDepth = newDepth;
        maxYoung = newYoung;
        globalIndex = newIndex;
        sharkRegions = newRegions;
    };
    // Getters and setter methods...
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public Integer getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(Integer maxDepth) {
        this.maxDepth = maxDepth;
    }

    public String getMaxYoung() {
        return maxYoung;
    }

    public void setMaxYoung(String maxYoung) {
        this.maxYoung = maxYoung;
    }

    public Integer getGlobalIndex() {
        return globalIndex;
    }

    public void setGlobalIndex(Integer globalIndex) {
        this.globalIndex = globalIndex;
    }

    public String getSharkRegions() {
        return sharkRegions;
    }

    public void setSharkRegions(String sharkRegions) {
        this.sharkRegions = sharkRegions;
    }
    public String toString(){
        return realName + " " + latinName + " " + maxLength + " " + 
                maxDepth + " " + maxYoung + " " + globalIndex + " " + 
                sharkRegions;
    }
}

