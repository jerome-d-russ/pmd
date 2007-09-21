/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package test.net.sourceforge.pmd.jerry.ast.xpath;

import junit.framework.TestCase;
import net.sourceforge.pmd.jerry.ast.xpath.ASTAndExpr;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;


/**
 * @author Romain PELISSE, belaran@gmail.com
 *
 */
public class ASTAndExprTest extends TestCase {

  private static final int ID = 1;

  @Test
  public void testConstructors() {
		assertNotNull(new ASTAndExpr(ID));
  }
}

