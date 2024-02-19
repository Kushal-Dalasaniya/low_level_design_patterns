package behavioural_design_patterns.iterator_pattern;

import java.util.ArrayList;
import java.util.List;

public class BrowsHitory {
	private List<String> urls;
	
	BrowsHitory(){
		urls = new ArrayList<String>();
	}
	
	void push(String url) {
		urls.add(url);
	}
	
	String getLastUrl() {
		String st = urls.get(urls.size()-1);
		urls.remove(urls.size()-1);
		return  st;
	}
	
	Iterator createIterator() {
		return new ListIterator(this);
	}
	
	public class ListIterator implements Iterator {
		BrowsHitory browsHitory;
		int ind;

		public ListIterator(BrowsHitory browsHitory) {
			super();
			this.browsHitory = browsHitory;
		}

		@Override
		public boolean hasNext() {
			return ind < browsHitory.urls.size();
		}

		@Override
		public String current() {
			return browsHitory.urls.get(ind);
		}

		@Override
		public void next() {
			ind++;
		}	
	}
}
