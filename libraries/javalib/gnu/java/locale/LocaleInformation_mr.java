/* LocaleInformation_mr.java --
   Copyright (C) 2004  Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
02111-1307 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */


// This file was automatically generated by gnu.localegen from LDML

package gnu.java.locale;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.ListResourceBundle;

public class LocaleInformation_mr extends ListResourceBundle
{
  private static final String currenciesDisplayNameKeys = "";

  private static final String currenciesDisplayNameValues = "";

  private static final Hashtable currenciesDisplayName;
  static
  {
    currenciesDisplayName = new Hashtable();
    Enumeration keys = new StringTokenizer(currenciesDisplayNameKeys, "|");
    Enumeration values = new StringTokenizer(currenciesDisplayNameValues, "|");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         currenciesDisplayName.put(key, value);
      }
  }

  private static final String currenciesSymbolKeys = "INR";

  private static final String currenciesSymbolValues = "\u0930\u0941";

  private static final Hashtable currenciesSymbol;
  static
  {
    currenciesSymbol = new Hashtable();
    Enumeration keys = new StringTokenizer(currenciesSymbolKeys, "|");
    Enumeration values = new StringTokenizer(currenciesSymbolValues, "|");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         currenciesSymbol.put(key, value);
      }
  }

  private static final String[] shortMonths = {
    "\u091c\u093e\u0928\u0947\u0935\u093e\u0930\u0940",
    "\u092b\u0947\u092c\u0943\u0935\u093e\u0930\u0940",
    "\u092e\u093e\u0930\u094d\u091a",
    "\u090f\u092a\u094d\u0930\u093f\u0932",
    "\u092e\u0947",
    "\u091c\u0942\u0928",
    "\u091c\u0941\u0932\u0948",
    "\u0913\u0917\u0938\u094d\u091f",
    "\u0938\u0947\u092a\u094d\u091f\u0947\u0902\u092c\u0930",
    "\u0913\u0915\u094d\u091f\u094b\u092c\u0930",
    "\u0928\u094b\u0935\u094d\u0939\u0947\u0902\u092c\u0930",
    "\u0921\u093f\u0938\u0947\u0902\u092c\u0930",
    null,
  };

  private static final String[] months = {
    "\u091c\u093e\u0928\u0947\u0935\u093e\u0930\u0940",
    "\u092b\u0947\u092c\u0943\u0935\u093e\u0930\u0940",
    "\u092e\u093e\u0930\u094d\u091a",
    "\u090f\u092a\u094d\u0930\u093f\u0932",
    "\u092e\u0947",
    "\u091c\u0942\u0928",
    "\u091c\u0941\u0932\u0948",
    "\u0913\u0917\u0938\u094d\u091f",
    "\u0938\u0947\u092a\u094d\u091f\u0947\u0902\u092c\u0930",
    "\u0913\u0915\u094d\u091f\u094b\u092c\u0930",
    "\u0928\u094b\u0935\u094d\u0939\u0947\u0902\u092c\u0930",
    "\u0921\u093f\u0938\u0947\u0902\u092c\u0930",
    null,
  };

  private static final String[] shortWeekdays = {
    null,
    "\u0930\u0935\u093f",
    "\u0938\u094b\u092e",
    "\u092e\u0902\u0917\u0933",
    "\u092c\u0941\u0927",
    "\u0917\u0941\u0930\u0941",
    "\u0936\u0941\u0915\u094d\u0930",
    "\u0936\u0928\u093f",
  };

  private static final String[] weekdays = {
    null,
    "\u0930\u0935\u093f\u0935\u093e\u0930",
    "\u0938\u094b\u092e\u0935\u093e\u0930",
    "\u092e\u0902\u0917\u0933\u0935\u093e\u0930",
    "\u092c\u0941\u0927\u0935\u093e\u0930",
    "\u0917\u0941\u0930\u0941\u0935\u093e\u0930",
    "\u0936\u0941\u0915\u094d\u0930\u0935\u093e\u0930",
    "\u0936\u0928\u093f\u0935\u093e\u0930",
  };

  private static final String[] ampms = {
    "\u092e.\u092a\u0942.",
    "\u092e.\u0928\u0902.",
  };

  private static final String[][] zoneStrings =
  {
    { "IST", "\u092d\u093e\u0930\u0924\u0940\u092f \u0938\u092e\u092f", "IST", "\u092d\u093e\u0930\u0924\u0940\u092f \u0938\u092e\u092f",  "Asia/Calcutta" },
  };

  private static final String territoriesKeys = "IN";

  private static final String territoriesValues = "\u092d\u093e\u0930\u0924";

  private static final Hashtable territories;
  static
  {
    territories = new Hashtable();
    Enumeration keys = new StringTokenizer(territoriesKeys, "|");
    Enumeration values = new StringTokenizer(territoriesValues, "|");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         territories.put(key, value);
      }
  }

  private static final String languagesKeys = "es|ku|eo|ks|en|el|qu|ko|kn|kok|km|kl|kk|wo|ka|dz|jv|pt|ps|de|pl|da|vo|ja|vi|cy|pa|cs|iu|it|co|is|uz|or|ik|ur|om|ca|ie|id|uk|ia|oc|ug|hy|br|hu|bo|bn|hr|bi|tw|bh|bg|tt|no|be|ts|hi|tr|nl|zu|ba|to|he|tn|tl|tk|ha|ne|az|ti|ay|th|tg|na|te|zh|as|ar|ta|gu|my|am|za|mt|ms|gn|sw|mr|sv|gl|su|af|st|mo|ss|mn|sr|sq|ml|ab|mk|aa|so|sn|mi|gd|sm|sl|mg|sk|ga|yo|si|sh|sg|yi|sd|fy|sa|fr|lv|lt|fo|rw|root|ru|lo|fj|ln|fi|ro|rn|rm|fa|la|xh|eu|ky|et";

  private static final String languagesValues = "\u0938\u094d\u092a\u093e\u0928\u093f\u0937|\u0915\u0941\u0930\u094d\u0926\u093f\u0937|\u0907\u0938\u094d\u092a\u0930\u093e\u0928\u094d\u091f\u094b|\u0915\u0936\u094d\u092e\u0940\u0930\u0940|\u0907\u0902\u0917\u094d\u0930\u0947\u091c\u0940|\u0917\u094d\u0930\u0940\u0915|\u0915\u094d\u0935\u0947\u091a\u0913|\u0915\u094b\u0930\u093f\u092f\u0928\u094d|\u0915\u0928\u094d\u0928\u0921|\u0915\u094b\u0902\u0915\u0923\u0940|\u0915\u0902\u092c\u094b\u0921\u093f\u092f\u0928|\u0917\u094d\u0930\u0940\u0928\u0932\u093e\u0928\u094d\u0921\u093f\u0915|\u0915\u091c\u093c\u0915|\u0909\u0932\u094b\u092b|\u091c\u093e\u0930\u094d\u091c\u093f\u092f\u0928\u094d|\u092d\u0942\u091f\u093e\u0928\u0940|\u091c\u093e\u0935\u0928\u0940\u0938\u094d|\u092a\u094b\u0930\u094d\u091a\u0941\u0917\u0940\u0938\u094d|\u092a\u0937\u094d\u091f\u094b (\u092a\u0941\u0937\u094d\u091f\u094b)|\u091c\u0930\u094d\u092e\u0928|\u092a\u094b\u0932\u093f\u0937|\u0921\u093e\u0928\u093f\u0937|\u0913\u0932\u093e\u092a\u0941\u0915|\u091c\u093e\u092a\u0928\u0940\u0938\u094d|\u0935\u093f\u092f\u0924\u094d\u0928\u093e\u092e\u0940\u091c\u093c|\u0935\u0947\u0932\u094d\u0937|\u092a\u0902\u091c\u093e\u092c\u0940|\u091c\u093c\u0947\u0915|\u0907\u0928\u0941\u0915\u093f\u091f\u0941\u091f\u094d|\u0907\u091f\u093e\u0932\u093f\u092f\u0928|\u0915\u094b\u0930\u094d\u0938\u093f\u0915\u0928|\u0906\u0908\u0938\u0932\u093e\u0928\u094d\u0921\u093f\u0915|\u0909\u091c\u093c\u092c\u0947\u0915|\u0913\u0930\u093f\u092f\u093e|\u0907\u0928\u0942\u092a\u093f\u092f\u093e\u0915|\u0909\u0930\u094d\u0926\u0942|\u0913\u0930\u094b\u092e\u094b (\u0905\u092b\u093e\u0928)|\u0915\u091f\u0932\u0928|\u0907\u0928\u094d\u091f\u0930\u0932\u093f\u0902\u0917|\u0907\u0928\u094d\u0921\u094b\u0928\u0947\u0937\u093f\u092f\u0928|\u092f\u0941\u0915\u094d\u0930\u0947\u0928\u093f\u092f\u0928\u094d|\u0907\u0928\u094d\u091f\u0930\u0932\u093f\u0902\u0917\u094d\u0935\u093e|\u0913\u0938\u093f\u091f\u093e\u0928\u094d|\u0909\u0927\u0942\u0930|\u0906\u0930\u094d\u092e\u0940\u0928\u093f\u092f\u0928\u094d|\u092c\u094d\u0930\u0947\u091f\u0928|\u0939\u0902\u0917\u0947\u0930\u093f\u092f\u0928\u094d|\u0924\u093f\u092c\u0947\u091f\u093f\u092f\u0928|\u092c\u0902\u0917\u093e\u0932\u0940|\u0915\u094d\u0930\u094b\u092f\u0947\u0937\u093f\u092f\u0928\u094d|\u092c\u093f\u0938\u0932\u092e\u093e|\u0924\u094d\u0935\u093f|\u092c\u0940\u0939\u093e\u0930\u0940|\u092c\u0932\u094d\u0917\u0947\u0930\u093f\u092f\u0928|\u091f\u091f\u093e\u0930|\u0928\u094b\u0930\u094d\u0935\u0947\u091c\u093f\u092f\u0928|\u092c\u0948\u0932\u094b\u0930\u0941\u0938\u093f\u092f\u0928|\u0924\u094d\u0938\u094b\u0917\u093e|\u0939\u093f\u0928\u094d\u0926\u0940|\u0924\u0941\u0930\u094d\u0915\u093f\u0937|\u0921\u091a|\u091c\u0941\u0932\u0942|\u092c\u0937\u094d\u0915\u093f\u0930|\u0924\u094b\u0902\u0917\u093e|\u0939\u0947\u092c\u0943|\u0938\u0947\u0924\u094d\u0938\u094d\u0935\u093e\u0928\u093e|\u0924\u0917\u093e\u0932\u094b\u0917|\u0924\u0941\u0930\u094d\u0915\u092e\u0947\u0928|\u0939\u094c\u0938\u093e|\u0928\u0947\u092a\u093e\u0932\u0940|\u0905\u091c\u093c\u0930\u092c\u093e\u0907\u091c\u093e\u0928\u0940|\u0924\u093f\u0917\u094d\u0930\u093f\u0928\u094d\u092f\u093e|\u0910\u092e\u0930\u093e|\u0925\u093e\u0908|\u0924\u091c\u093f\u0915|\u0928\u094c\u0930\u094b|\u0924\u0947\u0932\u0902\u0917\u0942|\u091a\u093f\u0928\u0940\u0938\u094d|\u0905\u0938\u093e\u092e\u0940|\u0905\u0930\u0947\u092c\u093f\u0915|\u0924\u092e\u093f\u0933|\u0917\u0941\u091c\u0930\u093e\u0924\u0940|\u092c\u0930\u094d\u092e\u0940\u0938\u094d|\u0905\u092e\u0939\u093e\u0930\u093f\u0915|\u091d\u094d\u0939\u0941\u0928\u094d\u0917|\u092e\u093e\u0932\u0924\u0940\u0938\u094d|\u092e\u0932\u092f|\u0917\u094c\u0930\u093e\u0928\u0940|\u0938\u094d\u0935\u093e\u0939\u093f\u0932\u0940|\u092e\u0930\u093e\u0920\u0940|\u0938\u094d\u0935\u0940\u0921\u093f\u0937|\u0917\u0947\u0932\u0940\u0936\u093f\u092f\u0928|\u0938\u0941\u0902\u0926\u0928\u0940\u0938\u094d|\u0905\u092b\u094d\u0930\u093f\u0915\u093e\u0928\u094d\u0938|\u0938\u0947\u0938\u094b\u0925\u094b|\u092e\u094b\u0932\u094d\u0921\u093e\u0935\u093f\u092f\u0928\u094d|\u0938\u093f\u0938\u094d\u0935\u0924\u0940|\u092e\u0902\u0917\u094b\u0932\u093f\u092f\u0928\u094d|\u0938\u0947\u0930\u094d\u092c\u093f\u092f\u0928\u094d|\u0906\u0932\u094d\u092c\u0947\u0928\u093f\u092f\u0928\u094d|\u092e\u0932\u093f\u092f\u093e\u0932\u092e|\u0905\u092c\u0916\u0947\u091c\u093f\u092f\u0928|\u092e\u0938\u0940\u0921\u094b\u0928\u093f\u092f\u0928\u094d|\u0905\u092b\u093e\u0930|\u0938\u094b\u092e\u093e\u0932\u0940|\u0936\u094b\u0928\u093e|\u092e\u093e\u0913\u0930\u0940|\u0938\u094d\u0915\u093e\u091f\u0938\u094d \u0917\u0947\u0932\u093f\u0915|\u0938\u092e\u094b\u0928|\u0938\u094d\u0932\u094b\u0935\u0947\u0928\u093f\u092f\u0928\u094d|\u092e\u0932\u093e\u0917\u0938\u0940|\u0938\u094d\u0932\u094b\u0935\u093e\u0915|\u0910\u0930\u093f\u0937|\u092f\u0942\u0930\u0941\u092c\u093e|\u0938\u093f\u0928\u094d\u0939\u0932\u0940\u0938\u094d|\u0938\u0947\u0930\u094d\u092c\u094b-\u0915\u094d\u0930\u094b\u092f\u0947\u0937\u093f\u092f\u0928\u094d|\u0938\u093e\u0902\u0917\u094d\u0930\u094b|\u0907\u0926\u094d\u0926\u093f\u0937|\u0938\u093f\u0902\u0927\u0940|\u092b\u094d\u0930\u093f\u0938\u093f\u092f\u0928\u094d|\u0938\u0902\u0938\u094d\u0915\u0943\u0924|\u092b\u094d\u0930\u0947\u0928\u094d\u091a|\u0932\u093e\u091f\u094d\u0935\u093f\u092f\u0928\u094d (\u0932\u0947\u091f\u094d\u091f\u093f\u0937)|\u0932\u093f\u0925\u0941\u0906\u0928\u093f\u092f\u0928\u094d|\u092b\u0947\u0930\u094b\u0938\u094d|\u0915\u093f\u0928\u094d\u092f\u093e\u0930\u094d\u0935\u093e\u0928\u094d\u0921\u093e|\u092e\u0930\u093e\u0920\u0940|\u0930\u0937\u094d\u092f\u0928\u094d|\u0932\u093e\u0913\u0924\u093f\u092f\u0928\u094d|\u092b\u093f\u091c\u0940|\u0932\u093f\u0902\u0917\u093e\u0932\u093e|\u092b\u093f\u0928\u094d\u0928\u093f\u0937|\u0930\u094b\u092e\u093e\u0928\u093f\u092f\u0928\u094d|\u0915\u093f\u0930\u0941\u0928\u094d\u0926\u0940|\u0930\u0939\u091f\u094b-\u0930\u094b\u092e\u093e\u0928\u094d\u0938\u094d|\u092a\u0930\u094d\u0937\u093f\u092f\u0928\u094d|\u0932\u093e\u091f\u093f\u0928|\u0915\u094d\u0938\u094d\u0939\u094b\u0938\u093e|\u092c\u093e\u0938\u094d\u0915|\u0915\u093f\u0930\u094d\u0917\u093f\u091c\u093c|\u0907\u0938\u094d\u091f\u094b\u0928\u093f\u092f\u0928\u094d";

  private static final Hashtable languages;
  static
  {
    languages = new Hashtable();
    Enumeration keys = new StringTokenizer(languagesKeys, "|");
    Enumeration values = new StringTokenizer(languagesValues, "|");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         languages.put(key, value);
      }
  }

  private static final Object[][] contents =
  {
    { "currenciesDisplayName", currenciesDisplayName },
    { "currenciesSymbol", currenciesSymbol },
    { "shortMonths", shortMonths },
    { "months", months },
    { "shortWeekdays", shortWeekdays },
    { "weekdays", weekdays },
    { "ampms", ampms },
    { "zoneStrings", zoneStrings },
    { "territories", territories },
    { "languages", languages },
  };

  public Object[][] getContents() { return contents; }
}