

import PJ4.VideoPoker;

class TestVideoPoker {

    public static void main(String args[]) 
    {
	VideoPoker pokergame;
	if (args.length > 0)
		pokergame = new VideoPoker(Integer.parseInt(args[0]));
	else
		pokergame = new VideoPoker();
	pokergame.play();
    }
}
