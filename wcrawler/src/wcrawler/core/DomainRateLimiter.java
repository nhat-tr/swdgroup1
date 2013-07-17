/**
 * Description: This is assignment project of Software Architecture and Design
 * Course The purpose of this project is to build a web crawler to get
 * information from some specific sites. In this case, crawler will get
 * information about drug from www.drugs.com
 */
/**
 * Created at: 12:17:19 AM Jul 18, 2013
 *
 * @author TanNhat Project: wcrawler
 */
package wcrawler.core;

import com.google.common.util.concurrent.RateLimiter;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.log4j.Logger;
import wcrawler._interface.IDomainRateLimiter;

public class DomainRateLimiter implements IDomainRateLimiter {
    private static Logger _logger = Logger.getLogger(DomainRateLimiter.class);
    
    private long defaultMinCrawlDelayInMilliSecs;
    private ConcurrentHashMap<String, RateLimiter> _rateLimiterLookup;

    public DomainRateLimiter(long defaultMinCrawlDelayInMilliSecs) {
        if(defaultMinCrawlDelayInMilliSecs < 0){
            throw new ArithmeticException("defaultMinCrawlDelayInMilliSecs");
        }
        this.defaultMinCrawlDelayInMilliSecs = defaultMinCrawlDelayInMilliSecs;
        
        _rateLimiterLookup = new ConcurrentHashMap<String, RateLimiter>();
    }
    
    
    @Override
    public void rateLimit(URL url) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addDomain(URL url, long minCrawlDelayInMilliSecs) {
        if(url == null)
            throw new NullPointerException("url");
        
        if(minCrawlDelayInMilliSecs < 1)
            throw new ArithmeticException("minCrawlDelayInMilliSecs");
        
        
        long millThatIsGreater = minCrawlDelayInMilliSecs > defaultMinCrawlDelayInMilliSecs ? minCrawlDelayInMilliSecs : defaultMinCrawlDelayInMilliSecs;
        RateLimiter rateLimiter = RateLimiter.create(millThatIsGreater);
        _rateLimiterLookup.put(url.getAuthority(), rateLimiter);
    }
}
