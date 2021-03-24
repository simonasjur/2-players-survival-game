package Detector;

import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Field;

import edu.umd.cs.findbugs.BugInstance;
import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.bcel.OpcodeStackDetector;


public class FinalsDetector extends OpcodeStackDetector{
final private BugReporter reporter; 
    
    private String currentClass;
    
    public FinalsDetector(BugReporter reporter) {
        this.reporter = reporter;
    }
    
    public void visit(JavaClass obj) {
        
        currentClass = obj.getClassName();
        for ( Field field : obj.getFields()) {
            
            if (field.isFinal()) {
                
                boolean found = false;
                
                for (Field cField : obj.getFields()) {
                    if (!cField.getName().equals(cField.getName().toUpperCase())) {
                        found = true;
                        break;
                    }
                }
                
                if (false == found)
                    reporter.reportBug(new BugInstance(this, "UNUSED_LOCAL_VARIABLES_BUG", NORMAL_PRIORITY).addClass(currentClass)
                            .addField(this).addString("Change to uppercase").addSourceLine(this));
            }           
        }
        super.visit(obj);
    }
    
    
    @Override
    public void sawOpcode(int arg0) {
    }

}
