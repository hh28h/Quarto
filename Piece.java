package Quarto;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Piece {
	
	public enum PieceColor {WHITE, BLACK}; 
	public enum PieceHeight {SHORT, TALL};
	public enum PieceFill {SOLID, HOLLOW};
	public enum PieceShape {SQUARE, CIRCLE};

	private PieceColor color;
	private PieceHeight height;
	private PieceFill fill;
	private PieceShape shape;

	private Piece[] inventory;  // not yet used pieces 
	private Piece[] board;		// already placed pieces

	public static final int BUTTON = 16;
	JButton[] pieceButton = new JButton[BUTTON];


	public Piece(PieceColor color, PieceHeight height, PieceFill fill, PieceShape shape) {
		this.color = color;
		this.height = height;
		this.fill = fill;
		this.shape = shape;
	}

	public Piece getColor() {
		return color;
	}

	public Piece getHeight() {
		return height;
	}
	
	public Piece getFill() {
		return fill;
	}
	
	public Piece getShape() {
		return shape;
	}


	public Piece[] setInventory(PieceColor color, PieceHeight height, PieceFill fill, PieceShape shape) {  

		Piece[] inventory = 

		//WHITE
		new Piece(Piece.PieceColor.WHITE, Piece.PieceHeight.SHORT, Piece.PieceFill.SOLID, Piece.PieceShape.CIRCLE),
		new Piece(Piece.PieceColor.WHITE, Piece.PieceHeight.SHORT, Piece.PieceFill.HOLLOW, Piece.PieceShape.CIRCLE), 
		new Piece(Piece.PieceColor.WHITE, Piece.PieceHeight.TALL, Piece.PieceFill.SOLID, Piece.PieceShape.CIRCLE), 
		new Piece(Piece.PieceColor.WHITE, Piece.PieceHeight.TALL, Piece.PieceFill.HOLLOW, Piece.PieceShape.CIRCLE), 
		new Piece(Piece.PieceColor.WHITE, Piece.PieceHeight.SHORT, Piece.PieceFill.SOLID, Piece.PieceShape.SQUARE), 
		new Piece(Piece.PieceColor.WHITE, Piece.PieceHeight.SHORT, Piece.PieceFill.HOLLOW, Piece.PieceShape.SQUARE), 
		new Piece(Piece.PieceColor.WHITE, Piece.PieceHeight.TALL, Piece.PieceFill.SOLID, Piece.PieceShape.SQUARE), 
		new Piece(Piece.PieceColor.WHITE, Piece.PieceHeight.TALL, Piece.PieceFill.HOLLOW, Piece.PieceShape.SQUARE), 
		
		//BLACK
		new Piece(Piece.PieceColor.BLACK, Piece.PieceHeight.SHORT, Piece.PieceFill.SOLID, Piece.PieceShape.CIRCLE), 
		new Piece(Piece.PieceColor.BLACK, Piece.PieceHeight.SHORT, Piece.PieceFill.HOLLOW, Piece.PieceShape.CIRCLE), 
		new Piece(Piece.PieceColor.BLACK, Piece.PieceHeight.TALL, Piece.PieceFill.SOLID, Piece.PieceShape.CIRCLE), 
		new Piece(Piece.PieceColor.BLACK, Piece.PieceHeight.TALL, Piece.PieceFill.HOLLOW, Piece.PieceShape.CIRCLE), 
		new Piece(Piece.PieceColor.BLACK, Piece.PieceHeight.TALL, Piece.PieceFill.SOLID, Piece.PieceShape.SQUARE), 
		new Piece(Piece.PieceColor.BLACK, Piece.PieceHeight.TALL, Piece.PieceFill.HOLLOW, Piece.PieceShape.SQUARE), 
		new Piece(Piece.PieceColor.BLACK, Piece.PieceHeight.SHORT, Piece.PieceFill.SOLID, Piece.PieceShape.SQUARE),
		new Piece(Piece.PieceColor.BLACK, Piece.PieceHeight.SHORT, Piece.PieceFill.HOLLOW, Piece.PieceShape.SQUARE) 
		
	};


	/**
	* Assigning the .png files to their corresponding Inventory variables.
	*/
	for (int i = 0; i < BUTTON; i++) {
		//WHITE
		if (i == 0) { 
			pieceButton[i] = new JButton(new ImageIcon("White_Short_Solid_Circle.png"));
			this.add(pieceButton[i]);
		} else if (i == 1) { 
			pieceButton[i] = new JButton(new ImageIcon("White_Short_Hollow_Circle.png"));
			this.add(pieceButton[i]);
		} else if (i == 2) {
			pieceButton[i] = new JButton(new ImageIcon("White_Tall_Solid_Circle.png"));
			this.add(pieceButton[i]);
		} else if (i == 3) {
			pieceButton[i] = new JButton(new ImageIcon("White_Tall_Hollow_Circle.png"));
			this.add(pieceButton[i]);
		} else if (i == 4) {
			pieceButton[i] = new JButton(new ImageIcon("White_Tall_Solid_Square.png"));
			this.add(pieceButton[i]);
		} else if (i == 5) {
			pieceButton[i] = new JButton(new ImageIcon("White_Tall_Hollow_Square.png"));
			this.add(pieceButton[i]);
		} else if (i == 6) {
			pieceButton[i] = new JButton(new ImageIcon("White_Short_Solid_Square.png"));
			this.add(pieceButton[i]);
		} else if (i == 7) {
			pieceButton[i] = new JButton(new ImageIcon("White_Short_Hollow_Square.png"));
			this.add(pieceButton[i]);

		//BLACK
		} else if (i == 8) { 	
			pieceButton[i] = new JButton(new ImageIcon("Black_Short_Solid_Circle.png"));
			this.add(pieceButton[i]);
		} else if (i == 9) {
			pieceButton[i] = new JButton(new ImageIcon("Black_Short_Hollow_Circle.png"));
			this.add(pieceButton[i]);
		} else if (i == 10) {
			pieceButton[i] = new JButton(new ImageIcon("Black_Tall_Solid_Circle.png"));
			this.add(pieceButton[i]);
		} else if (i == 11) {
			pieceButton[i] = new JButton(new ImageIcon("Black_Tall_Hollow_Circle.png"));
			this.add(pieceButton[i]);
		} else if (i == 12) {
			pieceButton[i] = new JButton(new ImageIcon("Black_Tall_Solid_Square.png"));
			this.add(pieceButton[i]);
		} else if (i == 13) {
			pieceButton[i] = new JButton(new ImageIcon("Black_Tall_Hollow_Square.png"));
			this.add(pieceButton[i]);
		} else if (i == 14) {
			pieceButton[i] = new JButton(new ImageIcon("Black_Short_Solid_Square.png"));
			this.add(pieceButton[i]);
		} else if (i == 15) {
			pieceButton[i] = new JButton(new ImageIcon("Black_Short_Hollow_Square.png"));
			this.add(pieceButton[i]);
		}
	}	
}