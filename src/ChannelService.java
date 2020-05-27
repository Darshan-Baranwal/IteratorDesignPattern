public class ChannelService {
static ChannelList<Channel> getChannelsData() {
	ChannelList<Channel> ch = new ChannelList<Channel>();
	ch.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
	ch.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
	ch.addChannel(new Channel(100.5, ChannelTypeEnum.PUNJABI));
	ch.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
	ch.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
	ch.addChannel(new Channel(103.5, ChannelTypeEnum.HINDI));
	ch.addChannel(new Channel(104.5, ChannelTypeEnum.ALL));
	ch.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
	ch.addChannel(new Channel(106.5, ChannelTypeEnum.PUNJABI));
	ch.addChannel(new Channel(103.5, ChannelTypeEnum.HINDI));
	ch.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
	ch.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
	ch.addChannel(new Channel(106.5, ChannelTypeEnum.ALL));
	return ch;
}
}
