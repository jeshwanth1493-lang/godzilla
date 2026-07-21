package FileDirectoryDesign;

import java.util.*;

public class FileMain {

    public static void main(String[] args) {

        FolderNode root = new FolderNode("rootFolder", 900);
        FileNode file1 = new FileNode("file1",500,20);
        FileNode file2 = new FileNode("file2",600,60);

        FolderNode subfolder = new FolderNode("Subfolder", 900);
        subfolder.addChild(file2);

        root.addChild(subfolder);
        root.addChild(file1);

        System.out.println("Root size: " + root.getSize());

        FileSystemService service = new FileSystemService();
        List<FolderNode> oldFolders = service.getFolderNodesOlderThan(root,950);

        for (FolderNode folder : oldFolders) {
            System.out.println(folder.name + " size=" + folder.getSize());
        }
    }
}
