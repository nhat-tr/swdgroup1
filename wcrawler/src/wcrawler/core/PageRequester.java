
/**
 * Description: 
 * This is assignment project of Software Architecture and Design Course
 * The purpose of this project is to build a web crawler to get information from
 * some specific sites. In this case, crawler will get information about drug 
 * from www.drugs.com
*/

/**
 * Created at: 10:32:07 AM  Jul 12, 2013
 * @author TanNhat
 * Project: wcrawler
 */
package wcrawler.core;

import wcrawler._interface.IPageRequester;
import wcrawler.information.CrawledPage;
import wcrawler.information.PageToCrawl;


/**
 *
 * @author TanNhat
 */
public class PageRequester implements IPageRequester{

        @Override
    public CrawledPage fetchPage(PageToCrawl page) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
