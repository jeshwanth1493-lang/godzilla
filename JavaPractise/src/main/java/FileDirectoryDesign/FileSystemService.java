package FileDirectoryDesign;


import java.util.*;

public class FileSystemService {

    public List<FolderNode> getFolderNodesOlderThan(FolderNode root,
                                        long dateThreshold) {

        List<FolderNode> resultNode = new ArrayList<>();
        dfs(root, dateThreshold,resultNode );
        return resultNode;
    }

    private void dfs(FolderNode rootFolder, long dateThreshold, List<FolderNode> resultNode) {

        if(rootFolder.createdDate < dateThreshold) {
            resultNode.add(rootFolder);
        }

        for(Node child : rootFolder.children) {
            if (child instanceof FolderNode) {
                    dfs((FolderNode) child, dateThreshold, resultNode);
                }

        }

    }


}
