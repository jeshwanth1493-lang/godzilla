package FileDirectoryDesign;

import java.util.*;

public class FolderNode extends Node{

    List<Node> children = new ArrayList<>();

    public FolderNode(String name, long createdDate) {
        super(name, createdDate);
    }

    public void addChild(Node child) {
        children.add(child);
    }


    @Override
    long getSize() {
       long totalSize = 0;
       for(Node child : children) {
           totalSize += child.getSize();
       }
        return totalSize;
    }
}
