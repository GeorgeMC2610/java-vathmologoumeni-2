public class Player
{
    //here we have all the data that a player has to have. but we have different ways a player can be made
    //also we must allow no players to not have a user-defined nickname or have health above 100
    private short health;
    private float x, y;
    private String nickname;

    //here's the first constructor. doesn't return anything, is not even void, it's just initializing the variables. the only user-defined variable here is the nickname
    public Player(String nickname)
    {
        this.nickname = nickname; //we only set this user-defined value, all the others will be 'default'
        this.health = 100;
        this.x = this.y = 0f;
    }

    //the second constructor allows the user to preset a player in a specific location. although, the nickname still stays a mandatory input
    public Player(String nickname, float x, float y)
    {
        this.nickname = nickname;       //this will always be a user-defined value
        this.health = 100;
        this.x = x;                     //but the x and y coordinates are also user-defined in this constructor
        this.y = y;
    }

    //this way we assure that every Player object has a user-defined nickname and starts with 100 health

    
    public void announceCoordinates()
    {
        System.out.println(this.nickname + " is at: " + this.x + ", " + this.y);
    }

    public void move(float x, float y)
    {
        this.x += x;
        this.y += y;
    }


}