package binarySearchTrees;

public class MorseCodeNodes<T> {
    //---------------------------------------------------------------------------
    // Disclaimer:      Code by Dale/Joyce/Weems                   Chapter 8
    //
    // Code concatenated by: Kennette Maddela
    // Support Class: Provides Nodes for BST
    //---------------------------------------------------------------------------

    private String info;
    private MorseCodeNodes<T> left;
    private MorseCodeNodes<T> right;

    public MorseCodeNodes(String info)
    {
        this.info = info;
        left = null;
        right = null;
    }

    public void setInfo(String info){
        this.info = info;
    }

    public String getInfo(){
        return info;
    }

    public void setLeft(MorseCodeNodes<T> link){
        left = link;
    }

    public void setRight(MorseCodeNodes<T> link){
        right = link;
    }

    public MorseCodeNodes<T> getLeft(){
        return left;
    }

    public MorseCodeNodes<T> getRight(){
        return right;
    }
}
