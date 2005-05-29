/* UnixFileSystemView.java --
   Copyright (C) 2005  Free Software Foundation, Inc.

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

package javax.swing.filechooser;

import java.io.File;
import java.io.IOException;
import javax.swing.Icon;


/**
 * DOCUMENT ME!
 */
class UnixFileSystemView extends FileSystemView
{
  /** DOCUMENT ME! */
  private static final String NEW_FOLDER_NAME = "NewFolder";

  /**
   * DOCUMENT ME!
   *
   * @param containingDir DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws IOException DOCUMENT ME!
   */
  public File createNewFolder(File containingDir) throws IOException
  {
    int count = 0;
    File f = null;
    String filename = containingDir.getAbsolutePath() + File.separator
                      + NEW_FOLDER_NAME;
    while (f == null)
      {
	String full = filename;
	if (count > 0)
	  full += "." + (count++);
	f = new File(full);
	if (f.isDirectory() || f.isFile())
	  {
	    count++;
	    f = null;
	  }
      }
    f.mkdir();
    return f;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public File[] getRoots()
  {
    return File.listRoots();
  }

  /**
   * DOCUMENT ME!
   *
   * @param f DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSystemDisplayName(File f)
  {
    // FIXME: Implement;
    return null;
  }

  /**
   * DOCUMENT ME!
   *
   * @param f DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Icon getSystemIcon(File f)
  {
    // FIXME: Implement;
    return null;
  }

  /**
   * DOCUMENT ME!
   *
   * @param f DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSystemTypeDescription(File f)
  {
    // FIXME: Implement.
    return null;
  }

  /**
   * DOCUMENT ME!
   *
   * @param f DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean isRoot(File f)
  {
    return isFileSystemRoot(f);
  }
}