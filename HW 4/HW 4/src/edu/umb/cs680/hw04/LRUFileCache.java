package edu.umb.cs680.hw04;
import java.io.IOException;
import java.nio.file.*;
import java.util.LinkedHashMap;


public class LRUFileCache extends FileCache{

	private final int cachesize;
    private static final float loadfactor = 0.75f;
    
    public LRUFileCache(final int cachesize) {
		this.cachesize = cachesize;
		cache = new LinkedHashMap<>(cachesize, loadfactor, true);
	}
    
    @Override
	protected boolean isCached(Path path) {
		Boolean decision = cache.containsKey(path);
		return decision;
	}

	@Override
	protected boolean isCacheFull() {
		Boolean descision = cache.size()==cachesize;
		return descision;
	}

	@Override
	protected void cacheFile(Path path) {
		try {
			String content = Files.readString(path);
			cache.put(path, content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	protected void replace(Path path) {
		try {
			String content = Files.readString(path);
			Path removeKey = cache.keySet().iterator().next();
			cache.remove(removeKey);
			cache.put(path, content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	}
