package FileDirectoryDesign;

public class FileNode extends Node {

    long size;

    public FileNode(String name, long createdDate, long size) {
        super(name, createdDate);
        this.size = size;
    }

    @Override
    long getSize() {
        return size;
    }
}
