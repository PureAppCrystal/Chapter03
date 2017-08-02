package TV;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	final int MIN_CHANNEL = 1;
	final int MAX_CHANNEL = 255;
	
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 100;
	
	//constructor
	public TV(int chn, int vol, boolean power) {
		
		chn = channelCheck(chn);
		vol = volumeCheck(vol);
		
		
		this.channel = chn;
		this.volume = vol;
		this.power = power;
		System.out.println("--Created TV Object--");
	}


	
	//getter
	public int getChannel() {
		return channel;
	}


	public int getVolume() {
		return volume;
	}


	public boolean isPower() {
		return power;
	}
	
	
	
	
	//function
	public void power( boolean power) {
		this.power = power;
		if (power) {
			System.out.println("-> Power On");
		} else {
			System.out.println("-> Power Off");
		}
	}
	
	public void channel( int chn) {
		System.out.println("-> Channel Set "+chn);
		this.channel = channelCheck(chn);
		
	}
	
	public void channel( boolean up) {  
		if ( up ) {
			System.out.println("-> channel Up");
			this.channel = channelCheck(this.channel+1);
		} else {
			System.out.println("-> channel Down");
			this.channel = channelCheck(this.channel-1);
		}
	}
	
	public void volume( int vol) {
		System.out.println("-> Volume Set "+vol);
		this.volume = volumeCheck(vol);
	}
	
	public void volume( boolean up) {
	
		if ( up ) {
			System.out.println("-> Volume Up");
			this.volume = volumeCheck(this.volume+1);
		} else {
			System.out.println("-> Volume Down");
			this.volume = volumeCheck(this.volume-1);
		}
	}
	
	public void status() {
		System.out.println("# status #");
		System.out.println("TV[power]    : "+isPower());
		System.out.println("TV[channel]  : "+getChannel());
		System.out.println("TV[volume]   : "+getVolume());
		System.out.println("");
	}
	
	
	
	public int channelCheck(int chn) {
		if (chn > 255 ) {
			System.out.println("! 채널은 255를 넘을 수 없습니다.");
			return 255;
		}
		
		if (chn < 1 ) {
			System.out.println("! 채널은 1부터 시작합니다.");
			return  1;
		}
		
		return chn;
	}
	
	public int volumeCheck(int vol) {
		if (vol > 100 ) {
			System.out.println("! 최대 볼륨은 100입니다.");
			return 100;
		}
		
		if (vol < 0 ) {
			System.out.println("! 최소 볼륨은 0입니다.");
			return  0;
		}
		
		return vol;
	}
	
	
	
	
	
	
}
