/**
 * Description: This is assignment project of Software Architecture and Design
 * Course The purpose of this project is to build a web crawler to get
 * information from some specific sites. In this case, crawler will get
 * information about drug from www.drugs.com
 */
/**
 * Created at: 10:29:04 AM Jul 12, 2013
 *
 * @author TanNhat Project: wcrawler
 */
package wcrawler.information;

import java.net.URL;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

public class CrawlContext {

    private URL rootUrl;
    private ConcurrentHashMap<String, String> crawledPages;
    private Date createdAtDatetime;
    private ConcurrentHashMap<String, String> downloadedPages;
    private PageToCrawl currentProcessingPage;
    private long numberOfCrawledPage;
    private long numberOfPageToCrawl;
    private CrawlConfiguration crawlConfiguration;
    private CrawlFilterPattern crawlFilterPattern;

    public CrawlFilterPattern getCrawlFilterPattern() {
        return crawlFilterPattern;
    }

    public void setCrawlFilterPattern(CrawlFilterPattern crawlFilterPattern) {
        this.crawlFilterPattern = crawlFilterPattern;
    }

    public URL getRootUrl() {
        return rootUrl;
    }

    public void setRootUrl(URL rootUrl) {
        this.rootUrl = rootUrl;
    }

    public Date getCreatedAtDatetime() {
        return createdAtDatetime;
    }

    public void setCreatedAtDatetime(Date createdAtDatetime) {
        this.createdAtDatetime = createdAtDatetime;
    }

    public PageToCrawl getCurrentProcessingPage() {
        return currentProcessingPage;
    }

    public void setCurrentProcessingPage(PageToCrawl currentProcessingPage) {
        this.currentProcessingPage = currentProcessingPage;
    }

    public long getNumberOfCrawledPage() {
        return numberOfCrawledPage;
    }

    public void setNumberOfCrawledPage(long numberOfCrawledPage) {
        this.numberOfCrawledPage = numberOfCrawledPage;
    }

    public long getNumberOfPageToCrawl() {
        return numberOfPageToCrawl;
    }

    public void setNumberOfPageToCrawl(long numberOfPageToCrawl) {
        this.numberOfPageToCrawl = numberOfPageToCrawl;
    }

    public ConcurrentHashMap<String, String> getCrawledPages() {
        return crawledPages;
    }

    public void setCrawledPages(ConcurrentHashMap<String, String> crawledPages) {
        this.crawledPages = crawledPages;
    }

    public ConcurrentHashMap<String, String> getDownloadedPages() {
        return downloadedPages;
    }

    public void setDownloadedPages(ConcurrentHashMap<String, String> downloadedPages) {
        this.downloadedPages = downloadedPages;
    }

    public CrawlConfiguration getCrawlConfiguration() {
        return crawlConfiguration;
    }

    public void setCrawlConfiguration(CrawlConfiguration crawlConfiguration) {
        this.crawlConfiguration = crawlConfiguration;
    }
}
