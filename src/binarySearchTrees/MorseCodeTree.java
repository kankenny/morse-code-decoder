package binarySearchTrees;

public class MorseCodeTree<T> implements MorseCodeTreeInterface<T> {
    //---------------------------------------------------------------------------
    // Code by: Kennette Maddela
    // Logical level:
    //---------------------------------------------------------------------------

    protected MorseCodeNodes<T> root;
    protected MorseCodeNodes<T> initialNode = new MorseCodeNodes<>("");

    public MorseCodeTree()  // Constructor: O(1) time complexity
    // Constructs the Morse Code Decision Tree according to the visual diagram (27 nodes in total).
    // InitialNode is the actual root of the tree that has no info.
    // The nodes are manually placed depending on the direction that corresponds to the char.
    // If ch = "•", go left and if ch = "-", go right.

    {   root = initialNode;
        MorseCodeNodes<T> nodeE = new MorseCodeNodes<>( "E");
        initialNode.setLeft(nodeE);
        MorseCodeNodes<T> nodeT = new MorseCodeNodes<>( "T");
        initialNode.setRight(nodeT);
        MorseCodeNodes<T> nodeI = new MorseCodeNodes<>( "I");
        initialNode.getLeft().setLeft(nodeI);
        MorseCodeNodes<T> nodeA = new MorseCodeNodes<>("A");
        initialNode.getLeft().setRight(nodeA);
        MorseCodeNodes<T> nodeN = new MorseCodeNodes<>( "N");
        initialNode.getRight().setLeft(nodeN);
        MorseCodeNodes<T> nodeM = new MorseCodeNodes<>( "M");
        initialNode.getRight().setRight(nodeM);
        MorseCodeNodes<T> nodeS = new MorseCodeNodes<>( "S");
        initialNode.getLeft().getLeft().setLeft(nodeS);
        MorseCodeNodes<T> nodeU = new MorseCodeNodes<>( "U");
        initialNode.getLeft().getLeft().setRight(nodeU);
        MorseCodeNodes<T> nodeR = new MorseCodeNodes<>( "R");
        initialNode.getLeft().getRight().setLeft(nodeR);
        MorseCodeNodes<T> nodeW = new MorseCodeNodes<>( "W");
        initialNode.getLeft().getRight().setRight(nodeW);
        MorseCodeNodes<T> nodeD = new MorseCodeNodes<>( "D");
        initialNode.getRight().getLeft().setLeft(nodeD);
        MorseCodeNodes<T> nodeK = new MorseCodeNodes<>( "K");
        initialNode.getRight().getLeft().setRight(nodeK);
        MorseCodeNodes<T> nodeG = new MorseCodeNodes<>( "G");
        initialNode.getRight().getRight().setLeft(nodeG);
        MorseCodeNodes<T> nodeO = new MorseCodeNodes<>( "O");
        initialNode.getRight().getRight().setRight(nodeO);
        MorseCodeNodes<T> nodeH = new MorseCodeNodes<>( "H");
        initialNode.getLeft().getLeft().getLeft().setLeft(nodeH);
        MorseCodeNodes<T> nodeV = new MorseCodeNodes<>( "V");
        initialNode.getLeft().getLeft().getLeft().setRight(nodeV);
        MorseCodeNodes<T> nodeF = new MorseCodeNodes<>( "F");
        initialNode.getLeft().getLeft().getRight().setLeft(nodeF);
        MorseCodeNodes<T> nodeL = new MorseCodeNodes<>( "L");
        initialNode.getLeft().getRight().getLeft().setLeft(nodeL);
        MorseCodeNodes<T> nodeP = new MorseCodeNodes<>( "P");
        initialNode.getLeft().getRight().getRight().setLeft(nodeP);
        MorseCodeNodes<T> nodeJ = new MorseCodeNodes<>( "J");
        initialNode.getLeft().getRight().getRight().setRight(nodeJ);
        MorseCodeNodes<T> nodeB = new MorseCodeNodes<>( "B");
        initialNode.getRight().getLeft().getLeft().setLeft(nodeB);
        MorseCodeNodes<T> nodeX = new MorseCodeNodes<>( "X");
        initialNode.getRight().getLeft().getLeft().setRight(nodeX);
        MorseCodeNodes<T> nodeC = new MorseCodeNodes<>( "C");
        initialNode.getRight().getLeft().getRight().setLeft(nodeC);
        MorseCodeNodes<T> nodeY = new MorseCodeNodes<>( "Y");
        initialNode.getRight().getLeft().getRight().setRight(nodeY);
        MorseCodeNodes<T> nodeZ = new MorseCodeNodes<>( "Z");
        initialNode.getRight().getRight().getLeft().setLeft(nodeZ);
        MorseCodeNodes<T> nodeQ = new MorseCodeNodes<>( "Q");
        initialNode.getRight().getRight().getLeft().setRight(nodeQ);
    }

    @Override
    public String decrypt(String encryptedString) // O(N) time complexity
    //---------------------------------------------------------------------------
    // System requirements: Each letter is partitioned by a space. Each word is partitioned by a double space
    //
    // Decode the morse code by reading the input. Left and right nodes are accessed depending on the char.
    // If ch = "•", go left and if ch = "-", go right. If a space is encountered, getInfo of the node.
    // If there is a double space, getInfo of the node then print out a space (partition of a word).
    //---------------------------------------------------------------------------
    {
        String decryptedString = "The code stands for: ";
        MorseCodeNodes<T> pointer = initialNode;
        // Create a pointer to avoid overwriting the initialNode

        for(int i = 0; i < encryptedString.length(); i++){
            // Iterate through the whole length of the encrypted string. Manipulate pointer
            // reference depending on the character.

            if(encryptedString.charAt(i) == '•')
                pointer = pointer.getLeft();
            // Go to the left node

            else if (encryptedString.charAt(i) == '-')
                pointer = pointer.getRight();
            // Go to the right node

            if (encryptedString.charAt(i) == ' ' || (i + 1) == encryptedString.length()) {
                // 1st boolean conditional statement matches a space
                // 2nd boolean conditional statement here handles if the encryptedString does not contain "#"
                // "#" demarcates the end of the string but other people do not use it so this must be handled.

                decryptedString += pointer.getInfo();
                pointer = initialNode;

                if (i + 1 < encryptedString.length() && encryptedString.charAt(i + 1) == ' ')
                    decryptedString += " ";
                // if two spaces are contiguous, a space is concatenated to the decryptedString
                // to set a partition to the word.
                // 1st boolean conditional statement handles index out of bounds exception
                // That statement is required since the user does not need to write "#" at the end, but
                // program will still work if # is used at the end.
            }

        }

        return decryptedString;
    }
}