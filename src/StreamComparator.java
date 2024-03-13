public class StreamComparator {


    public int compare(Stream stream1, Stream stream2) {
        int count1 = stream1.groups.size();
        int count2 = stream2.groups.size();
        return Integer.compare(count1, count2);
    }
}
