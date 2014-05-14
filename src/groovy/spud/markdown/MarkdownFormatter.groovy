package spud.markdown

import spud.core.FormatterInterface
import org.pegdown.*

class MarkdownFormatter implements FormatterInterface {
	String compile(String input) {
		if(!input) {
			return input
		}
		def processor = new PegDownProcessor(org.pegdown.Extensions.FENCED_CODE_BLOCKS | org.pegdown.Extensions.HARDWRAPS | org.pegdown.Extensions.AUTOLINKS | org.pegdown.Extensions.TABLES )
		return processor.markdownToHtml(input)
		/*RootNode astRoot = processor.parseMarkdown(input)*/
		/*String html = new MyCustomToHtmlSerializer().toHtml(astRoot);*/

		/*.markdownToHtml(input)*/
	}
}
