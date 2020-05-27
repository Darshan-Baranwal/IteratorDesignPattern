import java.util.ArrayList;
import java.util.List;

public class ChannelList<T> implements ChannelListInterface{
	private List<Channel> c;
	public ChannelList() {
		c = new ArrayList<>();
	}

	@Override
	public void addChannel(Channel ch) {
		c.add(ch);
	}

	@Override
	public ChannelIteratorInterface iterator(ChannelTypeEnum type) {
		return new ChannelListIteratorImpl(c, type);
	}
	
	private class ChannelListIteratorImpl implements ChannelIteratorInterface{
		private int position=0;
		private ChannelTypeEnum type;
		private List<Channel> channels;
		
		public ChannelListIteratorImpl(List<Channel> channels, ChannelTypeEnum type ) {
			this.channels = channels;
			this.type = type;
		}

		@Override
		public boolean hasNext() {
			while(position < channels.size()) {
				if(channels.get(position).getType().equals(type)) {
					return true;
				}else {
					position++;
				}
			}
			return false;
		}

		@Override
		public Channel next() {
			Channel channel = channels.get(position);
			position++;
			return channel;
		}
	}
	
}
