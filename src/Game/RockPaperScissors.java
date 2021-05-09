package Game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class RockPaperScissors {

	private JFrame frame;
	private JLabel lblComputer; 
	private JLabel labelComputerMove;
	private JLabel labelResult;
	private JLabel labelWinCount;
	private JLabel labelLoseCount;
	private JLabel labelDrawCount;
	private JLabel labelTotalCount;
	
	private int winCounter = 0;
	private int loseCounter = 0;
	private int totalCounter = 0;
	private int drawCounter = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RockPaperScissors window = new RockPaperScissors();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void game(String player)
	{
		String computer = "";
		
		int computersPick= (int)(Math.random() * 3);
		
		if(computersPick == 0)
        {
            computer = "ROCK";
        }

        else if(computersPick == 1)
        {
            computer = "PAPER";
        }

        else if(computersPick == 2)
        {
            computer = "SCISSORS";
        }
		
		
		labelComputerMove.setText(computer);
		
		if(player == computer)
        {
			labelResult.setText("DRAW!!!");
			drawCounter++;
        }

        else if(player == "ROCK")
        {
            if(computersPick == 1)
            {
                labelResult.setText("YOU LOSE!!");
                
                loseCounter++;
            }

            else
            {
            	labelResult.setText("YOU WIN!");
            	winCounter++;
            }
        }

        else if(player == "PAPER")
        {
            if(computersPick == 0)
            {
            	labelResult.setText("YOU WIN!");
            	winCounter++;
            }

            else
            {
            	labelResult.setText("YOU LOSE!!");
            	loseCounter++;
            }
        }
        else if(player == "SCISSORS")
        {
            if(computersPick == 0)
            {
            	labelResult.setText("YOU LOSE!!");
            	loseCounter++;
            }
            else
            {
            	labelResult.setText("YOU WIN!");
            	winCounter++;
            }
        }
		
		totalCounter++;
		
		labelWinCount.setText("" + winCounter);
		labelLoseCount.setText("" + loseCounter);
		labelDrawCount.setText("" + drawCounter);
		labelTotalCount.setText("" + totalCounter);
		
}

	/**
	 * Create the application.
	 */
	public RockPaperScissors() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("ROCK PAPER SCISSORS");
		frame.getContentPane().setBackground(new Color(119, 136, 153));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setResizable(false);
		frame.setBounds(100, 100, 980, 686);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnRock = new JButton("ROCK");
		btnRock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				String move = btnRock.getText();
				
				game(move);
				
			}
		});
		btnRock.setBounds(204, 93, 185, 82);
		frame.getContentPane().add(btnRock);
		
		JButton btnPaper = new JButton("PAPER");
		btnPaper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String move = btnPaper.getText();
				
				game(move);
			}
		});
		btnPaper.setBounds(423, 93, 185, 82);
		frame.getContentPane().add(btnPaper);
		
		JButton btnScissors = new JButton("SCISSORS");
		btnScissors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String move = btnScissors.getText();
				
				game(move);
			}
		});
		btnScissors.setBounds(650, 93, 173, 82);
		frame.getContentPane().add(btnScissors);
		
		JLabel lblYourMove = new JLabel("Your Move :");
		lblYourMove.setBackground(new Color(112, 128, 144));
		lblYourMove.setFont(new Font("SolaimanLipi", Font.PLAIN, 18));
		lblYourMove.setBounds(39, 112, 121, 44);
		frame.getContentPane().add(lblYourMove);
		
		lblComputer = new JLabel("Computer:");
		lblComputer.setFont(new Font("SolaimanLipi", Font.PLAIN, 18));
		lblComputer.setBounds(39, 294, 121, 44);
		frame.getContentPane().add(lblComputer);
		
		labelComputerMove = new JLabel("");
		labelComputerMove.setFont(new Font("Kristen ITC", Font.BOLD | Font.ITALIC, 19));
		labelComputerMove.setBounds(244, 275, 313, 117);
		frame.getContentPane().add(labelComputerMove);
		
		JLabel lblDontWorryI = new JLabel("Dont Worry I won't Cheat");
		lblDontWorryI.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblDontWorryI.setBounds(270, 217, 363, 37);
		frame.getContentPane().add(lblDontWorryI);
		
		JLabel lblResult = new JLabel("RESULT:");
		lblResult.setFont(new Font("SolaimanLipi", Font.BOLD | Font.ITALIC, 18));
		lblResult.setBounds(39, 493, 121, 44);
		frame.getContentPane().add(lblResult);
		
		labelResult = new JLabel("");
		labelResult.setFont(new Font("Script MT Bold", Font.BOLD | Font.ITALIC, 26));
		labelResult.setBounds(244, 490, 298, 117);
		frame.getContentPane().add(labelResult);
		
		JLabel lblNewLabel = new JLabel("Let's Have A Game, Shall we?");
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.ITALIC, 18));
		lblNewLabel.setBounds(350, 11, 307, 65);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCounts = new JLabel("Counts");
		lblCounts.setFont(new Font("SolaimanLipi", Font.PLAIN, 18));
		lblCounts.setBounds(669, 348, 121, 44);
		frame.getContentPane().add(lblCounts);
		
		JLabel lblWin = new JLabel("Win:");
		lblWin.setFont(new Font("SolaimanLipi", Font.PLAIN, 18));
		lblWin.setBounds(669, 403, 89, 44);
		frame.getContentPane().add(lblWin);
		
		JLabel lblLose = new JLabel("Lose:");
		lblLose.setFont(new Font("SolaimanLipi", Font.PLAIN, 18));
		lblLose.setBounds(669, 447, 89, 44);
		frame.getContentPane().add(lblLose);
		
		JLabel lblDraw = new JLabel("Draw:");
		lblDraw.setFont(new Font("SolaimanLipi", Font.PLAIN, 18));
		lblDraw.setBounds(669, 491, 89, 44);
		frame.getContentPane().add(lblDraw);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("SolaimanLipi", Font.PLAIN, 18));
		lblTotal.setBounds(669, 546, 89, 44);
		frame.getContentPane().add(lblTotal);
		
		labelWinCount = new JLabel("");
		labelWinCount.setFont(new Font("SolaimanLipi", Font.PLAIN, 18));
		labelWinCount.setBounds(779, 403, 64, 44);
		frame.getContentPane().add(labelWinCount);
		
		labelLoseCount = new JLabel("");
		labelLoseCount.setFont(new Font("SolaimanLipi", Font.PLAIN, 18));
		labelLoseCount.setBounds(779, 447, 64, 44);
		frame.getContentPane().add(labelLoseCount);
		
		labelDrawCount = new JLabel("");
		labelDrawCount.setFont(new Font("SolaimanLipi", Font.PLAIN, 18));
		labelDrawCount.setBounds(779, 491, 64, 44);
		frame.getContentPane().add(labelDrawCount);
		
		labelTotalCount = new JLabel("");
		labelTotalCount.setFont(new Font("SolaimanLipi", Font.PLAIN, 18));
		labelTotalCount.setBounds(779, 548, 64, 37);
		frame.getContentPane().add(labelTotalCount);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				winCounter = 0;
				loseCounter = 0;
				drawCounter = 0;
				totalCounter = 0;
				
				labelWinCount.setText("" + winCounter);
				labelLoseCount.setText("" + loseCounter);
				labelDrawCount.setText("" + drawCounter);
				labelTotalCount.setText("" + totalCounter);
			}
		});
		btnReset.setBounds(789, 601, 93, 34);
		frame.getContentPane().add(btnReset);
	}
}
