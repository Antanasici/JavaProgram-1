import java.util.Comparator;

// Comparator for sorting min length
class minComparator implements Comparator<Shark> {
    @Override
    public int compare(Shark o1, Shark o2) {
           return o1.getMaxLength().compareTo(o2.getMaxLength());
   }
}
// Comparator for sorting max length
class maxComparator implements Comparator<Shark> {
    @Override
    public int compare(Shark o1, Shark o2)  {
            return o2.getMaxLength().compareTo(o1.getMaxLength());
}

} 
