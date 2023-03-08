package view;
import java.awt.*;
import javax.swing.*;

import model.ChessGameBoard;

public class ChessPanel
    extends JPanel{
    private final ChessMenuBar    menuBar;
    private final ChessGameBoard  gameBoard;
    private final ChessGameLog    gameLog;
    private final ChessGraveyard  playerOneGraveyard;
    private final ChessGraveyard  playerTwoGraveyard;
    private final ChessGameEngine gameEngine;

    public ChessPanel(){
        this.setLayout( new BorderLayout() );
        menuBar = new ChessMenuBar();
        gameBoard = new ChessGameBoard();
        gameLog = new ChessGameLog();
        playerOneGraveyard = new ChessGraveyard( "Player 1's graveyard" );
        playerTwoGraveyard = new ChessGraveyard( "Player 2's graveyard" );
        this.add( menuBar, BorderLayout.NORTH );
        this.add( gameBoard, BorderLayout.CENTER );
        this.add( gameLog, BorderLayout.SOUTH );
        this.add( playerOneGraveyard, BorderLayout.WEST );
        this.add( playerTwoGraveyard, BorderLayout.EAST );
        this.setPreferredSize( new Dimension( 800, 600 ) );
        gameEngine = new ChessGameEngine( gameBoard ); // start the game
    }

    public ChessGameLog getGameLog(){
        return gameLog;
    }

    public ChessGameBoard getGameBoard(){
        return gameBoard;
    }

    public ChessGameEngine getGameEngine(){
        return gameEngine;
    }

    public ChessGraveyard getGraveyard( int whichPlayer ){
        switch (whichPlayer) {
            case 1:
                return playerOneGraveyard;
            case 2:
                return playerTwoGraveyard;
            default:
                return null;
        }
    }
}
