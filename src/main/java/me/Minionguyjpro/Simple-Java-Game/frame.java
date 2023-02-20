{
JFrame frame = new JFrame("Title");                 
frame.add(game);                                      
frame.pack();                                         
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
frame.setResizable(false);                              
frame.setLocationRelativeTo(null);                     
frame.setVisible(true);
}
