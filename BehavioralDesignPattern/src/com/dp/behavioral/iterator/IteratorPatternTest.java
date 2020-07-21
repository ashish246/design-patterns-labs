package com.dp.behavioral.iterator;

/**
 * Suppose we have a list of Radio channels and the client program want to
 * traverse through them one by one or based on the type of channel, for example
 * some client programs are only interested in English channels and want to
 * process only them, they don’t want to process other types of channels.
 * 
 * So we can provide a collection of channels to the client and let them write
 * the logic to traverse through the channels and decide whether to process
 * them. But this solution has lots of issues such as client has to come up with
 * the logic for traversal. We can’t make sure that client logic is correct and
 * if the number of client grows then it will become very hard to maintain.
 * 
 * Here we can use Iterator pattern and provide iteration based on type of
 * channel. We should make sure that client program can access the list of
 * channels only through the iterator.
 * 
 * @author Administrator
 *
 */
public class IteratorPatternTest {

	public static void main(String[] args) {
		ChannelCollection channels = populateChannels();
		ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);
		while (baseIterator.hasNext()) {
			Channel c = baseIterator.next();
			System.out.println(c.toString());
		}
		System.out.println("******");
		// Channel Type Iterator
		ChannelIterator englishIterator = channels
				.iterator(ChannelTypeEnum.ENGLISH);
		while (englishIterator.hasNext()) {
			Channel c = englishIterator.next();
			System.out.println(c.toString());
		}
	}

	private static ChannelCollection populateChannels() {
		ChannelCollection channels = new ChannelCollectionImpl();
		channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
		channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
		channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
		return channels;
	}

}