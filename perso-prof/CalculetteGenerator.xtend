/*
 * generated by Xtext
 */
package fr.univLille1.compil.calculette.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.univLille1.compil.calculette.calculette.Calculette
import fr.univLille1.compil.calculette.calculette.Expr
import fr.univLille1.compil.calculette.calculette.Calc
import fr.univLille1.compil.calculette.calculette.Number
import org.eclipse.emf.ecore.EObject
import fr.univLille1.compil.calculette.calculette.Var
import fr.univLille1.compil.calculette.calculette.Affect
import fr.univLille1.compil.calculette.calculette.Ligne

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class CalculetteGenerator implements IGenerator {
    Iterable<Affect> variables
    
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		variables = resource.allContents.toIterable.filter(Affect)
		for(c: resource.allContents.toIterable.filter(Calculette))
		   fsa.generateFile(
		   	  "calculette/Calc.java",
		   	  c.compile
		   )
	}
	
	def CharSequence compile(EObject o) {
		switch o {
			Calculette : '''
		package calculette;
		
		public class Calc {
			public static void main(String [ ] args)
				{
					int res = 0;
					«FOR variable:variables»
						int _«variable.name»;
					«ENDFOR»
					«FOR calcs:o.calculs»
						«calcs.compile»
					«ENDFOR»
					System.out.println(res);
				}
			
		}
	'''
	        Ligne : '''«o.e.compile»'''
	        Calc : '''res = «o.e.compile»;'''
	        Var : '''_«o.name»'''
            Number : '''«IF o.neg»-«ENDIF»«o.value»'''
	        Expr : '''(«o.left.compile») «o.op» («o.right.compile»)'''
	        Affect : '''_«o.name» = «o.right.compile»;'''
		}
	}
}