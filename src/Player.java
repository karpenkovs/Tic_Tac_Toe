public abstract class Player {

    private String nickName;
    private char type;


    Player(String name, char type){
        nickName = name;
        this.type = type;
    }

    public char getType(){
        return type;
    }

    public void  setType(char type){
        this.type = type;
    }
    public String getNickName(){
        return nickName;
    }

    public abstract String makeMove();

    @Override
    public boolean equals (Object obj){

        if (obj == null) {
            return false;
        }

        Player player = (Player) obj;

        if(player.getType() != this.getType()){
            return false;
        }else{
            return true;
        }
    }

}
