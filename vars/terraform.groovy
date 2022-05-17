def terraformpipleline = new org.opstree.ci.terraformCI.terraformWorkflow()

node{
  terraformpipleline.call(configFilePath: "/var/lib/jenkins/workspace/terraform/vpc")
}
