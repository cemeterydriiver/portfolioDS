public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem vindo!");
        String s = JOptionPane.showInputDialog("Digite seu nome!");
        JOptionPane.showMessageDialog(null, "Boa "+s+", você é muito legal!");
        String resposta1 = JOptionPane.showInputDialog("Qual é o contrário de papelada?");
        if(resposta1.equals("pavestida")){
            JOptionPane.showMessageDialog(null, "Acertou!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Errou!!");
        }
    }