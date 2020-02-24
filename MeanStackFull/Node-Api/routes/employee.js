const express = require("express");
const router = express.Router();
const Employee = require("../models/emp");
router.get("/", async (req, res) => {
  const employees = await Employee.find();
  try {
    res.status(400).json({
      error: false,
      data: employees
    });
  } catch (err) {
    res.status(400).json({
      error: true,
      msg: err.msg
    });
  }
});

router.get("/:id", async (req, res) => {
    const emp= await Employee.findById(req.params.id)
    if(!emp){
        res.status(404).json({
            error: true,
            msg: "Employee id does not exist"
          });
    }try {
        res.status(200).json({
            error: false,
            data:emp
          });
    } catch (err) {
        res.status(400).json({
            error: true,
            msg: err.msg
          });
    }
 /*  let id = req.params.id;
  console.log(id);
  res.status(200).json({
    error: false,
    msg: "get employee with id: " + id
  }); */
});

router.post("/", async (req, res) => {
  let emp = req.body;
  console.log(emp);
  let doc = await Employee.create(emp);
  try {
    res.status(201).json({
      error: false,
      data: doc
    });
  } catch (err) {
    res.status(400).json({
      error: true,
      msg: err.msg
    });
  }
});
router.put("/:id", async(req, res) => {
    const emp= await Employee.findByIdAndUpdate(req.params.id,req.body,{

        new:true,
        runValidators:true
    })
    if(!emp){
        res.status(404).json({
            error: true,
            msg: "Employee id does not exist"
          });
    }try {
        res.status(200).json({
            error: false,
            data:emp
          });
    } catch (err) {
        res.status(400).json({
            error: true,
            msg: err.msg
          });
    }
  
});
router.delete("/:id", async (req, res) => {
  const emp= await Employee.findByIdAndDelete(req.params.id)
  if(!emp){
    res.status(404).json({
        error: true,
        msg: "Employee id does not exist"
      });
}try {
    res.status(200).json({
        error: false,
        data:"Deleted Successfully"
      });
} catch (err) {
    res.status(400).json({
        error: true,
        msg: err.msg
      });
}

});

module.exports = router;
