package factoryPattern;

public class Client{

  // Client side code looks so clean.
  Website blogWebsite = WebsiteFactory.getWebsite(WebsiteFactory.WebsiteType.BLOG);

}
