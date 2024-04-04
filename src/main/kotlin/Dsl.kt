package org.example

class JobScheduler {
    private val jobs = mutableListOf<Job>()

    fun job(name: String, configure: Job.() -> Unit) {
        val job = Job(name).apply(configure)
        jobs.add(job)
    }

    fun listJobs() {
        jobs.forEach { println(it) }
    }
}

class Job(val name: String) {
    var description: String = ""
    private val steps = mutableListOf<Step>()

    fun step(name: String, action: () -> Unit) {
        val step = Step(name, action)
        steps.add(step)
    }

    override fun toString(): String {
        return "Job '$name': $description, Steps: ${steps.map(Step::name)}"
    }
}

data class Step(val name: String, val action: () -> Unit)

fun jobScheduler(init: JobScheduler.() -> Unit): JobScheduler {
    val scheduler = JobScheduler()
    scheduler.init()
    return scheduler
}

fun main() {

// Example usage:
    val scheduler = jobScheduler {
        job("Data Backup") {
            description = "Backs up the database and file system"

            step("Database Backup") {
                println("Backing up database...")
                // Database backup logic
            }

            step("File System Backup") {
                println("Backing up files...")
                // File system backup logic
            }
        }

        job("System Update") {
            description = "Updates system software"

            step("Check Disk Space") {
                println("Checking disk space...")
                // Disk space checking logic
            }

            step("Download Updates") {
                println("Downloading updates...")
                // Update download logic
            }

            step("Apply Updates") {
                println("Applying updates...")
                // Update application logic
            }
        }
    }

    scheduler.listJobs()
}
