/*
 * MATLAB Compiler: 4.17 (R2012a)
 * Date: Sat Aug 12 16:14:39 2017
 * Arguments: "-B" "macro_default" "-W" "java:Solve,Solve" "-T" "link:lib" "-d" 
 * "F:\\zzzzzzzzzz\\z2\\Solve\\src" "-w" "enable:specified_file_mismatch" "-w" 
 * "enable:repeated_file" "-w" "enable:switch_ignored" "-w" "enable:missing_lib_sentinel" 
 * "-w" "enable:demo_license" "-v" "class{Solve:F:\\zzzzzzzzzz\\eqSolve.m}" 
 */

package Solve;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class SolveMCRFactory
{
   
    
    /** Component's uuid */
    private static final String sComponentId = "Solve_683F4BC411B4E66922A176B9539739F9";
    
    /** Component name */
    private static final String sComponentName = "Solve";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(SolveMCRFactory.class)
        );
    
    
    private SolveMCRFactory()
    {
        // Never called.
    }
    
    public static MWMCR newInstance(MWComponentOptions componentOptions) throws MWException
    {
        if (null == componentOptions.getCtfSource()) {
            componentOptions = new MWComponentOptions(componentOptions);
            componentOptions.setCtfSource(sDefaultComponentOptions.getCtfSource());
        }
        return MWMCR.newInstance(
            componentOptions, 
            SolveMCRFactory.class, 
            sComponentName, 
            sComponentId,
            new int[]{7,17,0}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}
