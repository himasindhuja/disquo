package net.anthavio.disquo.api;

import java.util.Date;
import java.util.List;

import net.anthavio.disquo.api.ArgumentConfig.PostState;
import net.anthavio.disquo.api.ArgumentConfig.Related;


/**
 * 
 * @author martin.vanek
 *
 */
public abstract class DisqusCursorPostsMethod<B extends DisqusMethod<?, List<T>>, T> extends DisqusCursorMethod<B, T> {

	public DisqusCursorPostsMethod(Disqus disqus, DisqusMethodConfig config) {
		super(disqus, config);
	}

	public B setSince(Date since) {
		addParam("since", since);
		return getSelf();
	}

	public B addRelated(Related... related) {
		addParam("related", related);
		return getSelf();
	}

	public B setQuery(String query) {
		addParam("query", query);
		return getSelf();
	}

	public B addInclude(PostState... include) {
		addParam("include", include);
		return getSelf();
	}

}
