package abstract_factory.list_factory;
import abstract_factory.factory.*;

public class ListLink extends Link{
	public ListLink(String caption, String url) {
		super(caption, url);
	}
	public String makeHTML() {
		return "  <li><a href='" + url + "'>" + caption + "</a></li>\n";
	}
}
