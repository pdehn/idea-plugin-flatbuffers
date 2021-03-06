/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package com.pdehaan.flatbuffers;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.pdehaan.flatbuffers.psi.FlatbuffersTypes;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>flatbuffers.flex</tt>
 */
class FlatbuffersLexer implements FlexLexer, FlatbuffersTypes {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 13568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\11\1\12\1\13\6\14\1\15\23\14\1\16"+
    "\1\14\1\17\1\20\12\14\1\21\10\11\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\11\1\33\1\34\2\11\1\14\1\35\3\11\1\36\10\11\1\37\1\40\20\11\1\41\2\11"+
    "\1\42\5\11\1\43\4\11\1\44\1\45\4\11\51\14\1\46\3\14\1\47\1\50\4\14\1\51\12"+
    "\11\1\52\u0381\11");

  /* The ZZ_CMAP_Y table has 2752 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1\1\11\1\12\1\13\1\14\1\13\1\14\34"+
    "\13\1\15\1\16\1\17\10\1\1\20\1\21\1\13\1\22\4\13\1\23\10\13\1\24\12\13\1\25"+
    "\1\13\1\26\1\25\1\13\1\27\4\1\1\13\1\30\1\31\2\1\2\13\1\30\1\1\1\32\1\25\5"+
    "\13\1\33\1\34\1\35\1\1\1\36\1\13\1\1\1\37\5\13\1\40\1\41\1\42\1\13\1\30\1"+
    "\43\1\13\1\44\1\45\1\1\1\13\1\46\4\1\1\13\1\47\4\1\1\50\2\13\1\51\1\1\1\52"+
    "\1\16\1\25\1\53\1\54\1\55\1\56\1\57\1\60\2\16\1\61\1\54\1\55\1\62\1\1\1\63"+
    "\1\1\1\64\1\65\1\22\1\55\1\66\1\1\1\67\1\16\1\70\1\71\1\54\1\55\1\66\1\1\1"+
    "\60\1\16\1\41\1\72\1\73\1\74\1\75\1\1\1\67\2\1\1\76\1\36\1\55\1\51\1\1\1\77"+
    "\1\16\1\1\1\76\1\36\1\55\1\100\1\1\1\57\1\16\1\101\1\76\1\36\1\13\1\102\1"+
    "\57\1\103\1\16\1\42\1\104\1\105\1\13\1\106\1\107\3\1\1\25\2\13\1\110\1\107"+
    "\3\1\1\111\1\112\1\113\1\114\1\115\1\116\2\1\1\67\3\1\1\117\1\13\1\120\1\1"+
    "\1\121\7\1\2\13\1\30\1\103\1\1\1\122\1\123\1\124\1\125\1\1\2\13\1\126\2\13"+
    "\1\127\24\13\1\130\1\131\2\13\1\130\2\13\1\132\1\133\1\14\3\13\1\133\3\13"+
    "\1\30\2\1\1\13\1\1\5\13\1\134\1\25\45\13\1\135\1\13\1\25\1\30\4\13\1\30\1"+
    "\136\1\137\1\16\1\13\1\16\1\13\1\16\1\137\1\67\3\13\1\140\1\1\1\141\4\1\5"+
    "\13\1\27\2\13\1\142\4\13\1\40\1\13\1\143\3\1\1\13\1\144\1\47\2\13\1\145\1"+
    "\13\1\75\3\1\1\13\1\107\3\13\1\47\4\1\1\146\5\1\1\104\2\13\1\140\1\147\3\1"+
    "\1\150\1\13\1\151\1\42\2\13\1\40\1\1\2\13\1\140\1\1\1\37\1\42\1\13\1\144\6"+
    "\1\1\152\1\153\14\13\4\1\21\13\1\134\2\13\1\134\1\154\1\13\1\144\3\13\1\155"+
    "\1\156\1\157\1\120\1\156\2\1\1\160\4\1\1\161\1\1\1\120\6\1\1\162\1\163\1\164"+
    "\1\165\1\166\3\1\1\167\147\1\2\13\1\143\2\13\1\143\10\13\1\170\1\171\2\13"+
    "\1\126\3\13\1\172\1\1\1\13\1\107\4\173\4\1\1\103\35\1\1\174\2\1\1\175\1\25"+
    "\4\13\1\176\1\25\4\13\1\127\1\104\1\13\1\144\1\25\4\13\1\143\1\1\1\13\1\30"+
    "\3\1\1\13\40\1\133\13\1\40\4\1\135\13\1\40\2\1\10\13\1\120\4\1\2\13\1\144"+
    "\20\13\1\120\1\13\1\177\1\1\2\13\1\143\1\103\1\13\1\144\4\13\1\40\2\1\1\200"+
    "\1\201\5\13\1\202\1\13\1\144\1\27\3\1\1\200\1\203\1\13\1\31\1\1\3\13\1\140"+
    "\1\201\2\13\1\140\3\1\1\204\1\42\1\13\1\40\1\13\1\107\1\1\1\13\1\120\1\50"+
    "\2\13\1\31\1\103\1\1\1\205\1\206\2\13\1\46\1\1\1\207\1\1\1\13\1\210\3\13\1"+
    "\211\1\212\1\213\1\30\1\64\1\214\1\215\1\173\2\13\1\127\1\40\7\13\1\31\1\1"+
    "\72\13\1\140\1\13\1\216\2\13\1\145\20\1\26\13\1\144\6\13\1\75\2\1\1\107\1"+
    "\217\1\55\1\220\1\221\6\13\1\16\1\1\1\150\25\13\1\144\1\1\4\13\1\201\2\13"+
    "\1\27\2\1\1\145\7\1\1\205\7\13\1\120\2\1\1\25\1\30\1\25\1\30\1\222\4\13\1"+
    "\143\1\223\1\224\2\1\1\225\1\13\1\14\1\226\2\144\2\1\7\13\1\30\30\1\1\13\1"+
    "\120\3\13\1\67\2\1\2\13\1\1\1\13\1\227\2\13\1\40\1\13\1\144\2\13\1\230\3\1"+
    "\11\13\1\144\6\1\2\13\1\27\3\13\1\140\11\1\23\13\1\107\1\13\1\40\1\27\11\1"+
    "\1\231\2\13\1\232\1\13\1\40\1\13\1\107\1\13\1\143\4\1\1\13\1\233\1\13\1\40"+
    "\1\13\1\75\4\1\3\13\1\234\4\1\1\67\1\235\1\13\1\140\2\1\1\13\1\120\1\13\1"+
    "\120\2\1\1\117\1\13\1\47\1\1\3\13\1\40\1\13\1\40\1\13\1\31\1\13\1\16\6\1\4"+
    "\13\1\46\3\1\3\13\1\31\3\13\1\31\60\1\1\150\2\13\1\27\4\1\1\150\2\13\2\1\1"+
    "\13\1\46\1\1\1\150\1\13\1\107\2\1\2\13\1\236\1\150\2\13\1\31\1\237\1\240\2"+
    "\1\1\13\1\22\1\145\5\1\1\241\1\242\1\46\2\13\1\143\2\1\1\71\1\54\1\55\1\66"+
    "\1\1\1\243\1\16\21\1\3\13\1\1\1\244\13\1\2\13\1\143\2\1\1\245\2\1\3\13\1\1"+
    "\1\246\3\1\2\13\1\30\5\1\1\13\1\75\30\1\4\13\1\1\1\103\34\1\3\13\1\46\20\1"+
    "\71\13\1\75\16\1\14\13\1\140\53\1\2\13\1\143\75\1\44\13\1\107\33\1\43\13\1"+
    "\46\1\13\1\143\7\1\1\13\1\144\1\1\3\13\1\1\1\140\1\1\1\150\1\247\1\13\67\1"+
    "\4\13\1\47\1\67\3\1\1\150\6\1\1\16\77\1\6\13\1\30\1\120\1\46\1\75\66\1\5\13"+
    "\1\205\3\13\1\137\1\250\1\251\1\252\3\13\1\253\1\254\1\13\1\255\1\256\1\36"+
    "\24\13\1\257\1\13\1\36\1\127\1\13\1\127\1\13\1\205\1\13\1\205\1\143\1\13\1"+
    "\143\1\13\1\55\1\13\1\55\1\13\1\207\3\1\14\13\1\47\123\1\1\252\1\13\1\260"+
    "\1\261\1\262\1\263\1\264\1\265\1\266\1\145\1\267\1\145\24\1\55\13\1\107\2"+
    "\1\103\13\1\47\15\13\1\144\150\13\1\16\25\1\41\13\1\144\36\1");

  /* The ZZ_CMAP_A table has 2944 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\1\1\1\51\1\2\1\1\22\0\1\2\1\0\1\13\5\0\1\15\1\16\2\0\1\26\1\12\1"+
    "\7\1\6\12\3\1\25\1\24\1\0\1\23\3\0\4\4\1\11\25\4\1\17\1\14\1\20\1\0\1\5\1"+
    "\0\1\35\1\43\1\31\1\34\1\10\1\46\1\50\1\47\1\27\2\4\1\32\1\36\1\30\1\44\1"+
    "\40\1\4\1\42\1\37\1\41\1\33\3\4\1\45\1\4\1\21\1\0\1\22\7\0\1\51\24\0\1\4\12"+
    "\0\1\4\4\0\1\4\5\0\27\4\1\0\12\4\4\0\14\4\16\0\5\4\7\0\1\4\1\0\1\4\1\0\5\4"+
    "\1\0\2\4\2\0\4\4\1\0\1\4\6\0\1\4\1\0\3\4\1\0\1\4\1\0\4\4\1\0\23\4\1\0\13\4"+
    "\10\0\6\4\1\0\26\4\2\0\1\4\6\0\10\4\10\0\13\4\5\0\3\4\33\0\6\4\1\0\1\4\17"+
    "\0\2\4\7\0\2\4\12\0\3\4\2\0\2\4\1\0\16\4\15\0\11\4\13\0\1\4\30\0\6\4\4\0\2"+
    "\4\4\0\1\4\5\0\6\4\4\0\1\4\11\0\1\4\3\0\1\4\7\0\11\4\7\0\5\4\17\0\26\4\3\0"+
    "\1\4\2\0\1\4\7\0\11\4\4\0\10\4\2\0\2\4\2\0\26\4\1\0\7\4\1\0\1\4\3\0\4\4\3"+
    "\0\1\4\20\0\1\4\15\0\2\4\1\0\1\4\5\0\6\4\4\0\2\4\1\0\2\4\1\0\2\4\1\0\2\4\17"+
    "\0\4\4\1\0\1\4\3\0\3\4\20\0\11\4\1\0\2\4\1\0\2\4\1\0\5\4\3\0\1\4\2\0\1\4\30"+
    "\0\1\4\13\0\10\4\2\0\1\4\3\0\1\4\1\0\6\4\3\0\3\4\1\0\4\4\3\0\2\4\1\0\1\4\1"+
    "\0\2\4\3\0\2\4\3\0\3\4\3\0\14\4\13\0\10\4\1\0\2\4\10\0\3\4\5\0\4\4\1\0\5\4"+
    "\3\0\1\4\3\0\2\4\15\0\13\4\2\0\1\4\21\0\1\4\5\0\22\4\3\0\10\4\1\0\11\4\1\0"+
    "\1\4\2\0\7\4\11\0\1\4\1\0\2\4\15\0\2\4\1\0\1\4\2\0\2\4\1\0\1\4\2\0\1\4\6\0"+
    "\4\4\1\0\7\4\1\0\3\4\1\0\1\4\1\0\1\4\2\0\2\4\1\0\4\4\1\0\2\4\11\0\1\4\2\0"+
    "\5\4\1\0\1\4\25\0\14\4\1\0\24\4\13\0\5\4\3\0\6\4\4\0\4\4\3\0\1\4\3\0\2\4\7"+
    "\0\3\4\4\0\15\4\14\0\1\4\1\0\6\4\1\0\1\4\5\0\1\4\2\0\13\4\1\0\15\4\1\0\4\4"+
    "\2\0\7\4\1\0\1\4\1\0\4\4\2\0\1\4\1\0\4\4\2\0\7\4\1\0\1\4\1\0\4\4\2\0\16\4"+
    "\2\0\6\4\2\0\15\4\2\0\1\4\1\0\10\4\7\0\15\4\1\0\6\4\23\0\1\4\4\0\1\4\3\0\11"+
    "\4\1\0\1\4\5\0\17\4\1\0\16\4\2\0\14\4\13\0\1\4\15\0\7\4\7\0\16\4\15\0\2\4"+
    "\11\0\4\4\1\0\4\4\3\0\2\4\11\0\10\4\1\0\1\4\1\0\1\4\1\0\1\4\1\0\6\4\1\0\7"+
    "\4\1\0\1\4\3\0\3\4\1\0\7\4\3\0\4\4\2\0\6\4\14\0\2\51\7\0\1\4\15\0\1\4\2\0"+
    "\1\4\4\0\1\4\2\0\12\4\1\0\1\4\3\0\5\4\6\0\1\4\1\0\1\4\1\0\1\4\1\0\4\4\1\0"+
    "\13\4\2\0\4\4\5\0\5\4\4\0\1\4\4\0\2\4\13\0\5\4\6\0\4\4\3\0\2\4\14\0\10\4\7"+
    "\0\10\4\1\0\7\4\6\0\2\4\12\0\5\4\5\0\2\4\3\0\7\4\6\0\3\4\12\0\2\4\13\0\11"+
    "\4\2\0\27\4\2\0\7\4\1\0\3\4\1\0\4\4\1\0\4\4\2\0\6\4\3\0\1\4\1\0\1\4\2\0\5"+
    "\4\1\0\12\4\12\0\5\4\1\0\3\4\1\0\10\4\4\0\7\4\3\0\1\4\3\0\2\4\1\0\1\4\3\0"+
    "\2\4\2\0\5\4\2\0\1\4\1\0\1\4\30\0\3\4\3\0\6\4\2\0\6\4\2\0\6\4\11\0\7\4\4\0"+
    "\5\4\3\0\5\4\5\0\1\4\1\0\10\4\1\0\5\4\1\0\1\4\1\0\2\4\1\0\2\4\1\0\12\4\6\0"+
    "\12\4\2\0\6\4\2\0\6\4\2\0\6\4\2\0\3\4\3\0\14\4\1\0\16\4\1\0\2\4\1\0\2\4\1"+
    "\0\10\4\6\0\4\4\4\0\16\4\2\0\1\4\1\0\14\4\1\0\2\4\3\0\1\4\2\0\4\4\1\0\2\4"+
    "\12\0\10\4\6\0\6\4\1\0\3\4\1\0\12\4\3\0\1\4\12\0\4\4\25\0\1\4\1\0\1\4\3\0"+
    "\7\4\1\0\1\4\1\0\4\4\1\0\17\4\1\0\2\4\14\0\3\4\4\0\2\4\1\0\1\4\20\0\4\4\10"+
    "\0\1\4\13\0\10\4\5\0\3\4\2\0\1\4\2\0\2\4\2\0\4\4\1\0\14\4\1\0\1\4\1\0\7\4"+
    "\1\0\21\4\1\0\4\4\2\0\10\4\1\0\7\4\1\0\14\4\1\0\4\4\1\0\5\4\1\0\1\4\3\0\14"+
    "\4\2\0\10\4\1\0\2\4\1\0\1\4\2\0\1\4\1\0\12\4\1\0\4\4\1\0\1\4\1\0\1\4\6\0\1"+
    "\4\4\0\1\4\1\0\1\4\1\0\1\4\1\0\3\4\1\0\2\4\1\0\1\4\2\0\1\4\1\0\1\4\1\0\1\4"+
    "\1\0\1\4\1\0\1\4\1\0\2\4\1\0\1\4\2\0\4\4\1\0\7\4\1\0\4\4\1\0\4\4\1\0\1\4\1"+
    "\0\12\4\1\0\5\4\1\0\3\4\1\0\5\4\1\0\5\4");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\1\1\5\1\4"+
    "\1\1\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\13\4\2\0\1\20\1\4\1\0"+
    "\1\21\1\0\23\4\1\22\1\4\1\21\1\4\1\23"+
    "\22\4\1\24\2\4\1\25\1\26\12\4\1\27\1\4"+
    "\1\30\1\31\4\4\1\32\1\33\1\4\1\34\4\4"+
    "\1\35\1\36\1\4\1\37\1\40\2\4\1\41\1\42"+
    "\1\4\1\43\1\44\1\4\1\45\6\4\1\46\1\47"+
    "\1\50";

  private static int [] zzUnpackAction() {
    int [] result = new int[134];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\52\0\124\0\176\0\250\0\322\0\374\0\52"+
    "\0\u0126\0\u0150\0\52\0\52\0\52\0\52\0\52\0\52"+
    "\0\52\0\52\0\52\0\52\0\u017a\0\u01a4\0\u01ce\0\u01f8"+
    "\0\u0222\0\u024c\0\u0276\0\u02a0\0\u02ca\0\u02f4\0\u031e\0\u0348"+
    "\0\u0372\0\u039c\0\u03c6\0\u0150\0\52\0\u03f0\0\u041a\0\u0444"+
    "\0\u046e\0\u0498\0\u04c2\0\u04ec\0\u0516\0\u0540\0\u056a\0\u0594"+
    "\0\u05be\0\u05e8\0\u0612\0\u063c\0\u0666\0\u0690\0\u06ba\0\u06e4"+
    "\0\u070e\0\u0348\0\u0738\0\u0150\0\u0762\0\322\0\u078c\0\u07b6"+
    "\0\u07e0\0\u080a\0\u0834\0\u085e\0\u0888\0\u08b2\0\u08dc\0\u0906"+
    "\0\u0930\0\u095a\0\u0984\0\u09ae\0\u09d8\0\u0a02\0\u0a2c\0\u0a56"+
    "\0\322\0\u0a80\0\u0aaa\0\322\0\322\0\u0ad4\0\u0afe\0\u0b28"+
    "\0\u0b52\0\u0b7c\0\u0ba6\0\u0bd0\0\u0bfa\0\u0c24\0\u0c4e\0\322"+
    "\0\u0c78\0\322\0\322\0\u0ca2\0\u0ccc\0\u0cf6\0\u0d20\0\322"+
    "\0\322\0\u0d4a\0\322\0\u0d74\0\u0d9e\0\u0dc8\0\u0df2\0\322"+
    "\0\322\0\u0e1c\0\322\0\322\0\u0e46\0\u0e70\0\322\0\322"+
    "\0\u0e9a\0\322\0\322\0\u0ec4\0\322\0\u0eee\0\u0f18\0\u0f42"+
    "\0\u0f6c\0\u0f96\0\u0fc0\0\322\0\322\0\322";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[134];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\2\6\1\7\1\10\1\11"+
    "\1\6\1\2\1\12\1\2\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\6\1\27\1\30\1\31\1\32\1\6\1\33\1\6"+
    "\1\34\1\35\1\36\2\6\1\37\2\6\54\0\1\3"+
    "\52\0\1\4\52\0\1\5\3\0\1\40\2\41\43\0"+
    "\3\6\2\0\2\6\15\0\22\6\7\0\1\42\46\0"+
    "\3\6\2\0\2\6\15\0\1\6\1\43\20\6\1\0"+
    "\1\44\1\0\11\44\1\45\1\46\35\44\3\0\3\6"+
    "\2\0\2\6\15\0\1\6\1\47\20\6\4\0\3\6"+
    "\2\0\2\6\15\0\6\6\1\50\13\6\4\0\3\6"+
    "\2\0\2\6\15\0\15\6\1\51\4\6\4\0\3\6"+
    "\2\0\2\6\15\0\1\52\1\53\1\6\1\54\4\6"+
    "\1\55\3\6\1\56\5\6\4\0\3\6\2\0\2\6"+
    "\15\0\15\6\1\57\4\6\4\0\3\6\2\0\2\6"+
    "\15\0\12\6\1\60\7\6\4\0\3\6\2\0\2\6"+
    "\15\0\12\6\1\61\5\6\1\62\1\6\4\0\3\6"+
    "\2\0\2\6\15\0\6\6\1\63\4\6\1\64\6\6"+
    "\4\0\3\6\2\0\2\6\15\0\15\6\1\65\4\6"+
    "\4\0\3\6\2\0\2\6\15\0\15\6\1\66\1\67"+
    "\3\6\4\0\3\6\2\0\2\6\15\0\3\6\1\70"+
    "\2\6\1\71\13\6\4\0\1\72\51\0\1\72\6\0"+
    "\1\40\37\0\1\42\1\0\50\42\3\0\3\6\2\0"+
    "\2\6\15\0\4\6\1\73\15\6\1\0\1\44\1\0"+
    "\11\44\1\74\1\46\35\44\3\0\3\6\2\0\2\6"+
    "\15\0\2\6\1\75\7\6\1\76\7\6\4\0\3\6"+
    "\2\0\2\6\15\0\7\6\1\77\12\6\4\0\3\6"+
    "\2\0\2\6\15\0\1\6\1\100\20\6\4\0\3\6"+
    "\2\0\2\6\15\0\1\6\1\101\20\6\4\0\3\6"+
    "\2\0\2\6\15\0\1\102\21\6\4\0\3\6\2\0"+
    "\2\6\15\0\15\6\1\103\4\6\4\0\3\6\2\0"+
    "\2\6\15\0\20\6\1\104\1\6\4\0\3\6\2\0"+
    "\2\6\15\0\16\6\1\105\3\6\4\0\3\6\2\0"+
    "\2\6\15\0\4\6\1\106\15\6\4\0\3\6\2\0"+
    "\2\6\15\0\12\6\1\107\7\6\4\0\3\6\2\0"+
    "\2\6\15\0\13\6\1\110\6\6\4\0\3\6\2\0"+
    "\2\6\15\0\15\6\1\111\4\6\4\0\3\6\2\0"+
    "\2\6\15\0\14\6\1\112\5\6\4\0\3\6\2\0"+
    "\2\6\15\0\4\6\1\113\15\6\4\0\3\6\2\0"+
    "\2\6\15\0\15\6\1\114\4\6\4\0\3\6\2\0"+
    "\2\6\15\0\15\6\1\115\4\6\4\0\3\6\2\0"+
    "\2\6\15\0\12\6\1\116\7\6\4\0\3\6\2\0"+
    "\2\6\15\0\15\6\1\117\4\6\4\0\3\6\2\0"+
    "\2\6\15\0\3\6\1\120\16\6\4\0\3\6\2\0"+
    "\2\6\15\0\7\6\1\121\12\6\4\0\3\6\2\0"+
    "\2\6\15\0\3\6\1\122\16\6\4\0\3\6\2\0"+
    "\1\123\1\6\15\0\22\6\4\0\3\6\2\0\2\6"+
    "\15\0\21\6\1\124\4\0\3\6\2\0\2\6\15\0"+
    "\12\6\1\125\7\6\4\0\3\6\2\0\2\6\15\0"+
    "\15\6\1\126\4\6\4\0\3\6\2\0\2\6\15\0"+
    "\1\6\1\127\20\6\4\0\3\6\2\0\2\6\15\0"+
    "\15\6\1\130\4\6\4\0\3\6\2\0\2\6\15\0"+
    "\12\6\1\131\7\6\4\0\3\6\2\0\2\6\15\0"+
    "\14\6\1\132\5\6\4\0\3\6\2\0\2\6\15\0"+
    "\13\6\1\133\6\6\4\0\3\6\2\0\2\6\15\0"+
    "\1\134\3\6\1\135\15\6\4\0\3\6\2\0\2\6"+
    "\15\0\13\6\1\136\6\6\4\0\3\6\2\0\2\6"+
    "\15\0\3\6\1\137\16\6\4\0\3\6\2\0\1\140"+
    "\1\6\15\0\22\6\4\0\3\6\2\0\2\6\15\0"+
    "\12\6\1\141\7\6\4\0\3\6\2\0\2\6\15\0"+
    "\3\6\1\142\16\6\4\0\3\6\2\0\1\143\1\6"+
    "\15\0\22\6\4\0\3\6\2\0\2\6\15\0\6\6"+
    "\1\144\13\6\4\0\3\6\2\0\2\6\15\0\10\6"+
    "\1\145\11\6\4\0\3\6\2\0\2\6\15\0\4\6"+
    "\1\146\15\6\4\0\3\6\2\0\2\6\15\0\10\6"+
    "\1\147\11\6\4\0\3\6\2\0\2\6\15\0\1\6"+
    "\1\150\20\6\4\0\3\6\2\0\2\6\15\0\21\6"+
    "\1\151\4\0\3\6\2\0\2\6\15\0\13\6\1\152"+
    "\6\6\4\0\3\6\2\0\1\153\1\6\15\0\22\6"+
    "\4\0\3\6\2\0\2\6\15\0\3\6\1\154\16\6"+
    "\4\0\3\6\2\0\2\6\15\0\1\155\21\6\4\0"+
    "\3\6\2\0\2\6\15\0\1\6\1\156\20\6\4\0"+
    "\3\6\2\0\2\6\15\0\2\6\1\157\17\6\4\0"+
    "\3\6\2\0\2\6\15\0\12\6\1\160\7\6\4\0"+
    "\3\6\2\0\1\161\1\6\15\0\22\6\4\0\2\6"+
    "\1\162\2\0\2\6\15\0\22\6\4\0\3\6\2\0"+
    "\2\6\15\0\12\6\1\163\7\6\4\0\3\6\2\0"+
    "\1\164\1\6\15\0\22\6\4\0\3\6\2\0\2\6"+
    "\15\0\5\6\1\165\14\6\4\0\3\6\2\0\2\6"+
    "\15\0\11\6\1\166\10\6\4\0\3\6\2\0\2\6"+
    "\15\0\12\6\1\167\7\6\4\0\3\6\2\0\1\170"+
    "\1\6\15\0\22\6\4\0\3\6\2\0\2\6\15\0"+
    "\14\6\1\171\5\6\4\0\3\6\2\0\2\6\15\0"+
    "\21\6\1\172\4\0\3\6\2\0\2\6\15\0\12\6"+
    "\1\173\7\6\4\0\3\6\2\0\2\6\15\0\12\6"+
    "\1\174\7\6\4\0\3\6\2\0\1\175\1\6\15\0"+
    "\22\6\4\0\3\6\2\0\2\6\15\0\6\6\1\176"+
    "\13\6\4\0\3\6\2\0\2\6\15\0\4\6\1\177"+
    "\15\6\4\0\3\6\2\0\2\6\15\0\16\6\1\200"+
    "\3\6\4\0\3\6\2\0\2\6\15\0\2\6\1\201"+
    "\17\6\4\0\3\6\2\0\2\6\15\0\12\6\1\202"+
    "\7\6\4\0\3\6\2\0\2\6\15\0\11\6\1\203"+
    "\10\6\4\0\3\6\2\0\1\204\1\6\15\0\22\6"+
    "\4\0\3\6\2\0\1\205\1\6\15\0\22\6\4\0"+
    "\3\6\2\0\1\206\1\6\15\0\22\6\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4074];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\5\1\1\11\2\1\12\11\13\1\2\0"+
    "\2\1\1\0\1\11\1\0\140\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[134];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  FlatbuffersLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return (TokenType.BAD_CHARACTER);
            }
          case 41: break;
          case 2: 
            { return (TokenType.WHITE_SPACE);
            }
          case 42: break;
          case 3: 
            { return (INTEGER_LITERAL);
            }
          case 43: break;
          case 4: 
            { return (IDENTIFIER);
            }
          case 44: break;
          case 5: 
            { return (DOT);
            }
          case 45: break;
          case 6: 
            { return (OPEN_PARENTHESIS);
            }
          case 46: break;
          case 7: 
            { return (CLOSE_PARENTHESIS);
            }
          case 47: break;
          case 8: 
            { return (OPEN_BRACE);
            }
          case 48: break;
          case 9: 
            { return (CLOSE_BRACE);
            }
          case 49: break;
          case 10: 
            { return (OPEN_BLOCK);
            }
          case 50: break;
          case 11: 
            { return (CLOSE_BLOCK);
            }
          case 51: break;
          case 12: 
            { return (EQUAL);
            }
          case 52: break;
          case 13: 
            { return (SEMICOLON);
            }
          case 53: break;
          case 14: 
            { return (COLON);
            }
          case 54: break;
          case 15: 
            { return (COMMA);
            }
          case 55: break;
          case 16: 
            { return (COMMENT);
            }
          case 56: break;
          case 17: 
            { return (STRING_LITERAL);
            }
          case 57: break;
          case 18: 
            { return (FLOAT_LITERAL);
            }
          case 58: break;
          case 19: 
            { return (INT);
            }
          case 59: break;
          case 20: 
            { return (ENUM);
            }
          case 60: break;
          case 21: 
            { return (LONG);
            }
          case 61: break;
          case 22: 
            { return (UINT);
            }
          case 62: break;
          case 23: 
            { return (TRUE);
            }
          case 63: break;
          case 24: 
            { return (BOOL);
            }
          case 64: break;
          case 25: 
            { return (BYTE);
            }
          case 65: break;
          case 26: 
            { return (UNION);
            }
          case 66: break;
          case 27: 
            { return (ULONG);
            }
          case 67: break;
          case 28: 
            { return (UBYTE);
            }
          case 68: break;
          case 29: 
            { return (SHORT);
            }
          case 69: break;
          case 30: 
            { return (TABLE);
            }
          case 70: break;
          case 31: 
            { return (FLOAT);
            }
          case 71: break;
          case 32: 
            { return (FALSE);
            }
          case 72: break;
          case 33: 
            { return (USHORT);
            }
          case 73: break;
          case 34: 
            { return (DOUBLE);
            }
          case 74: break;
          case 35: 
            { return (STRING);
            }
          case 75: break;
          case 36: 
            { return (STRUCT);
            }
          case 76: break;
          case 37: 
            { return (INCLUDE);
            }
          case 77: break;
          case 38: 
            { return (NAMESPACE);
            }
          case 78: break;
          case 39: 
            { return (ATTRIBUTE);
            }
          case 79: break;
          case 40: 
            { return (ROOT_TYPE);
            }
          case 80: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
