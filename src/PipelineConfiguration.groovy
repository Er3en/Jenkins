/**
 * Class which provides a configuration of some pipeline
 */
public class PipelineConfiguration {

    List supportedOS
    Map productExtensions
    String artifactNameBase

    /**
     * Main constructor
     *
     * @param supportedOS list of supported OS
     * @param productExtensions map with extension of product for each OS
     * @param artifactNameBase the name of the artifact without OS name / version. It must be same for any OS / version
     */
    PipelineConfiguration(Map params) {
        this.supportedOS = params["supportedOS"]
        this.productExtensions = params["productExtensions"]
        this.artifactNameBase = params["artifactNameBase"]
    }

}