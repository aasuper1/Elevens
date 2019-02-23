Questions:

Activity 1: N/A

Activity 2: 
	1. A deck is an object that stores many card objects. It creates a card object for each combination of rank and suit. 
	2. The combinations are given by the number of ranks multiplied by the number of suits. It will have 6 cards. 
	3. ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}; suits = {"Hearts", "Spades", "Diamonds", "Clubs"}; pointValues = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
	4. No it does not because each combination of rank and suit is created regardless. The only thing that matters is that the pointValues correspond with the right rank.
	
Activity 3:
	1. 
		public static string flip() {
 			 if (Math.random() > 0.33333) {
   				 return "head";
 			 } else {
  				  return "tails";
			 }
		}
	2. 
	public static boolean arePermutations(int[] a, int[] b){
    for(int i = 0; i < a.length; i++){
        boolean test1 = false;
        for(int k = 0; k < b.length; k++){
            if(a[i] == b[k]){
                test1 = true;
            }
        }
        if(test1){
            return true;
        }

    }
   		return false;
	}
	3. (0, 1, 1, 0). This will switch 4 with one creating 4, 2, 3, 1. Then it will switch 3 with 2 creating 4, 3, 2, 1. Then it will switch values with themselves maintaining the order. 
	
Activity 6:
	1. For 5♠ 4♥ 2♦ 6♣ A♠ J♥ K♦ 5♣ 2♠, the possible playable options are to remove the (5♠ and 6♣) or (5♣ and 6♣)
	2. Yes because for there to only be three cards left an odd number of cards must have been removed. It is impossible to end up with an odd number of number cards. Also the face cards can only be removed with a JQK combo. This means that the only way to be left with a 3 card game is for there to be a JQK combo. 
	3. There is no strategy in this game if there is more than one choice possible it will not make a difference because suit does not matter and the cards are already in a predefined order. 
	
Activity 7:
	1. You would need a deck of cards and 9 card spots.
	2. 
		1: Shuffle Cards
		2: Deal 9 cards
		3: Find pairs of 11/JQK combos
		4: Replace pairs if there are cards left in the deck
		5: If the board and deck are empty
		6: If no pairs or combos can be found, the game is lost
		7: Repeat steps 3-6
	3. Yes it has the board space and the deck of cards
	4: 
		a. It is called in the ElevensBoard constructor and in the newGame() function.
		b. anotherPlayIsPossible() and isLegal() should call it in order to see to validate the intended board state.
		c. It returns an array with the indexes of the playable cards on the board so it will return (0, 1, 3, 6, 7)
		d. 
			for (Integer i : cIndexes) {
 				System.out.println(board.cards[i].toString());
			} 
		e. anotherPlayIsPossible() must do so in order to determine which card arrays to pass to the containsPairSum11 and containsJQK methods.

Activity 8:
	1: Elevens, Thirteens, and Tens involve a deck of cards, they involve a board with a set number of spaces, they have similar play styles with number pairs adding up to a number. They differ in the number of spaces on the board, the number which they have to add up to, and the procedure to do a combo. 
	2: There will be certain variable that are unset in the superclass. When the instance is made, the values will be passed into that constuctor. 
	3: They cover the differences because the shared capability and data storage are inherited from the Board class. All the differences like the anotherPlayIsPossible and isLegal functions are left as abstract to be implemented fully in the subclasses. 
	
Activity 9: 
	1: size is a property not a behavior, therefore there is no need to have an abstract function but just an instance variable that has a value based on the type of game. 
	2: That functionality is the same regardless of the game and can be implemented once in the superclass which will have its functionality inherited by subclasses. 
	3: It would still allow the calls to be made polymorphically but each method would have to be implemented separately for the game to work.
	