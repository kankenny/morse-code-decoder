package binarySearchTrees;

public interface MorseCodeTreeInterface<T> {
    //---------------------------------------------------------------------------
    // Code by: Kennette Maddela
    // Abstract level: BinaryTree does not need any other methods as
    // the nodes are manually placed according to the morse code international
    // standard.
    //---------------------------------------------------------------------------

    String decrypt(String encryptedText);
    //---------------------------------------------------------------------------
    // System requirements: Each letter is partitioned by a space. Each word is partitioned by a double space
    //
    // Decode the morse code by reading the input. Left and right nodes are accessed depending on the char.
    // If ch = "•", go left and if ch = "-", go right. If a space is encountered, getInfo of the node.
    // If there is a double space, getInfo of the node then print out a space (partition of a word).
    //---------------------------------------------------------------------------


}
