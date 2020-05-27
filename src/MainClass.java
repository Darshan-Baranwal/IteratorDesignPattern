public class MainClass {
	public static void main(String[] args) {
		ChannelList<Channel> ch = ChannelService.getChannelsData();
		ChannelIteratorInterface iterator = ch.iterator(ChannelTypeEnum.PUNJABI);
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
