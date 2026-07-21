package FileDirectoryDesign;

abstract class Node {

    String name;
    long createdDate;

    public Node(String name, long createdDate) {
        this.name = name;
        this.createdDate = createdDate;
    }

    abstract long getSize();
}
