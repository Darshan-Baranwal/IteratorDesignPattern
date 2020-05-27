public class Channel {
	private ChannelTypeEnum type;
	private double channelNumber;
	public ChannelTypeEnum getType() {
		return type;
	}
	public void setType(ChannelTypeEnum type) {
		this.type = type;
	}
	public double getChannelNumber() {
		return channelNumber;
	}
	public void setChannelNumber(float channelNumber) {
		this.channelNumber = channelNumber;
	}
	public Channel(double d, ChannelTypeEnum english) {
		super();
		this.type = english;
		this.channelNumber = d;
	}
	@Override
	public String toString() {
		return "Channel [type=" + type + ", channelNumber=" + channelNumber + "]";
	}
}
